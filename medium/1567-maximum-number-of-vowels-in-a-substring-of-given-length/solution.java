class Solution {
    public int maxVowels(String s, int k) {
          String vowels ="aeiou";
          int currentVowelCount = 0;

        // initial window from index 0
        for (int i = 0; i < k; i++){
            char v= s.charAt(i);
            if (vowels.indexOf(s.charAt(i)) != -1 ){
                currentVowelCount++;
            }
        }
        //Intitialise maxVowel with firs window count
        int maxVowelCount = currentVowelCount; 
        //slide window
        for (int i = k; i < s.length();i++){
            //Add the new character (right end of window)
            if (vowels.indexOf(s.charAt(i)) != -1){
                currentVowelCount++;
            }
            //remove the character sliding out (left end of window)
            if (vowels.indexOf(s.charAt(i - k)) != -1){
                currentVowelCount--;       //removes the vowel count of the character that is leaving the current window.
            }
           //update maxVowelCount
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        } 
    
        return maxVowelCount;     
    }

}