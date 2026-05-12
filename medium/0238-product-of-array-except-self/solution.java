class Solution {
    public int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int[] prefProduct= new int[size];
        int[] suffProduct = new int[size];
        int[] answer = new int[size];

        // Contruct the prefix products array
        prefProduct[0] = 1;
        for (int i =1; i < size; i ++){
            prefProduct[i]= prefProduct[i-1] * nums[i-1];
        }
        //construct the suffix products array
        suffProduct[size-1] = 1;
        for (int i= size-2; i >= 0; i--){
            suffProduct[i] = suffProduct[i+1] * nums[i+1];
        }
        //construct answer array using prefProduct[] * suffProduct[]
        for (int i = 0; i < size; i ++){
            answer[i]= prefProduct[i] * suffProduct[i];
        }

        return answer; 
    }
}