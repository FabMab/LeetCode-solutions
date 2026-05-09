class Solution {

    public boolean valid(String s1, String s2, int k){
        int s1Len = s1.length();
        int s2Len = s2.length();

        if (s1Len % k > 0 || s2Len % k > 0){
            return false;
        }else{
            String base = s1.substring(0, k);
            return s1.replace(base, "").isEmpty() && s2.replace(base, "").isEmpty();
        }
    }
    public String gcdOfStrings(String str1, String str2) {

        int s1Len = str1.length();
        int s2Len = str2.length();

        for (int i = Math.min(s1Len, s2Len); i >=1; --i){

            if (valid(str1, str2, i)){
                return str1.substring(0, i);
            }
        }
        return "";
    }
}