class Solution {
    public int longestSubarray(int[] nums) {  
        int left = 0;        //left boundary of sliding window
        int zeroCount = 0;   //number of 0s currently inside the window 
        int maxWindow = 0;   //Longest valid subarray of 1s so far

        //expand the window by moving right pointer across entire array
        for (int i = 0; i <nums.length; i++){
            if (nums[i] == 0){
               zeroCount++;
            }
            
            //Shrink from the left if window becomes invalid -invalid when it holds more tha 1 zero 
            //k =1 
            while (zeroCount > 1){
               if (nums[left] == 0){
                zeroCount--;            //Element being evicted is 0
               } 
                left++;                 //shrink window by one from left
            } 
            maxWindow = Math.max(maxWindow, i- left);
        }   

        return maxWindow;     
    }
}