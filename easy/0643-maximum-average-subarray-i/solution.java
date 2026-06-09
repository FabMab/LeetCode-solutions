class Solution {
    public double findMaxAverage(int[] nums, int k) {
    //compute sum of first window of size k
    double kSum = 0;
    for (int i = 0; i < k; i ++){
        kSum += nums[i];
    }
    //initialise maxSum with first window
    double maxSum = kSum;
    for (int i = k; i < nums.length; i++ ){
        //update window sum : remove 1st element of previous window, add last element of current window
        kSum += nums[i] - nums[i-k];
        maxSum= Math.max(maxSum, kSum);
    }
    //Maximum average
    return maxSum/k;
        
    }
}