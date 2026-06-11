class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;       //left boundary of sliding window
        int maxLength =0;  //Maximum length of consecutive 1s achievable (Longest valid window so far)
        int zeroCount =0;  //number of 0s inside the current window

        //expand the window (right pointer) across entire array
        for (int right = 0; right <nums.length; right++){
            if (nums[right] == 0){
                zeroCount++;        //If we encounter a 0, count it as flip needed
            }
        
        //If we have more 0s than allowed flips (zeroCount > k), shrink window from the left, meaning remove element left
            if (zeroCount > k){
               if (nums[left] == 0){
                zeroCount--;            //remove 0 from window
                } 
                left++;                 //Move left pointer forward, shrinking window from left
            }
            //Update MaxLength: Window size = right -left+1 (inclusive in both ends)
            //At this point window is always valid (zeroCount <=k)
            maxLength = Math.max(maxLength, right - left +1);                   
        }
        return maxLength;
    }
}