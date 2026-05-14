class Solution {
    public boolean increasingTriplet(int[] nums) {

        // first Smallest value found 
        int first = Integer.MAX_VALUE;

        //Second smallest value found
        int second = Integer.MAX_VALUE;

        //Traverse array once
        for(int i= 0; i < nums.length; i ++){

            //Update first & second smallest number
            if (nums[i] <= first){
                first =nums[i]; 
            }else if(nums[i] <= second){
                second = nums[i];
            }
            // found number bigger thn both
            else {
                return true;
            }
            
        }
        //No increasing triplet found
       return false; 
    }
}