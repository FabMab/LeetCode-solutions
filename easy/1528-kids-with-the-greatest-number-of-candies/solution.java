class Solution {
    private int findLargest(int[] candies){
        //find largest element
        //initiate max as first element
        // Alternatively iterate & use Math.max
        int max = candies[0];
        for (int i= 0; i < candies.length; i++){
             if(candies[i] > max){
                //update max
                max = candies[i];
            }
        } 
        return max;
    }         
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         ArrayList<Boolean> result = new ArrayList<>();
        for (int i= 0; i < candies.length; i++){
            int maxCandies = findLargest(candies);
            if(candies[i] + extraCandies >= maxCandies){    
                result.add(true);       
            }else{
                result.add(false);
            } 
        } 
        return result;   
    }
}