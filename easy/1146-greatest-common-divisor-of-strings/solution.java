class Solution {

    public String gcdOfStrings(String str1, String str2){
        if (!(str1 +str2).equals(str2 +str1)){
            return "";
        }

        int lenGCD = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGCD);
        
    }

    public int gcd(int len1, int len2) {

        while (len2 != 0){   // Euclidean Algorithm - Moves len2 into len1,replaces len2 with the remainder of len1 % len2 in each iteration

            int temp= len2;
            len2 = len1 % len2;
            len1 = temp;

        }
        return len1;
    }
}