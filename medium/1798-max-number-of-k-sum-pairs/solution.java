class Solution {
    public int maxOperations(int[] nums, int k) {
        //Sort the array in increasing order to enable 2 pointer technique
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length -1;
        int count = 0;

        while (left < right){
           int sum = nums[left] + nums[right];
           
           if (sum == k){//sum found, increase count and move both pointers as numbers can only be used once
               count++;
               left++;
               right--;
            }else if (sum < k){ 
            //sum is too small, need larger number, therefore move left pointer
              left++;
            } else {
            //sum is too large, need smaller number number
            right--;
            }   
        }
        return count;
    }
}