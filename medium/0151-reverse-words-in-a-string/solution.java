class Solution {
    public String reverseWords(String s) {

        String [] words = s.split("\\s+"); // split string into String array of words, without the spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length -1; i >=0; i--){
            result.append(words[i]);
            if  (i !=0){
            result.append(" "); // add white space after each word until when i=0
            }
        }

        return result.toString().trim(); // trim()used to remove leading whitespace not removed by regex
        
    }
}