class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;  //position for next non-zero element
        
        for (int i = 0; i < n; i ++){

            if (nums[i] != 0){
                int temp = nums[i];
                nums[i]= nums[left]; // move non-zero element to the left
                nums[left] = temp;   // element at nums[left] goes to nums[i]
                left++;              // move pointer forward
            }
        }
        
    }
}