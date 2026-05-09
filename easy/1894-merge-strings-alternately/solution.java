class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder alternateLetters =  new StringBuilder();
        String mergedString;
        int pointer = 0;
        // Notes : Take length of 2 strings for iteration; use pointer initialised at 0, add each character to stringbuilder as long as
        //pointer is < word

        while (word1.length() + word2.length() != pointer){ //for (int pointer= 0; pointer < (word1.length() + word2.length()); pointer++){  
            if (pointer < word1.length()){
                alternateLetters.append(word1.charAt(pointer));
            }
            if (pointer < word2.length()){
                alternateLetters.append(word2.charAt(pointer));
            }
            pointer ++;
        }
        mergedString = alternateLetters.toString();
        return mergedString;
        
    }
}