class Solution {
    public boolean isSubsequence(String s, String t) {

        int i =0;
        int j = 0; // Pointers for scanning strings s & t 

        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;          //i only moves to check next character in s when a matching character is found in t
            }
            j++;  //j always move forward because we continuously scan trough t
        }
        return i == s.length(); // if reached end of s, all characters were found in order
    }
}