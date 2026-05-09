class Solution {
    public String reverseVowels(String s) {

        // Convert string to mutable char array for in-place swapping
        char [] chars = s.toCharArray();

        // 2 pointers method: left starts from beginning, right from end
        int left = 0;
        int right = s.length()- 1;
    
        while (left < right){

            //move left pointer when vowel is found
            while(left < right && !isVowel(chars[left])){
               left ++;    
            }

           //move right pointer when vowel is found
           while(left < right && !isVowel(chars[right])){
                right --;
           } 

           //Swap the vowels
           char temp = chars[left];
           chars[left] = chars[right];
           chars[right] = temp;

           //move both pointers inward after swap
           left++;
           right--;

        }

        return new String(chars);       
    }

    //Helper method to check if charcter is a vowel
    private Boolean isVowel(char c){

        //indexOf return -1 if character is not found
            return "aeiouAEIOU".indexOf(c) != -1;
        }
}