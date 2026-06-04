class Solution {
 /**
     * Returns the maximum amount of water a container can store.
     * 
     * @param height array of vertical line heights
     * @return maximum area
     */   
//We need to calculate the max area (maxWater) of a rectangle (holding most water) and return it (width x height)
// Width is the distance between 2 heights

    public int maxArea(int[] height) {
        // Initialize two pointers at both ends because maximum width gives best chance for large area initially
        int left = 0;
        int right = height.length -1;
        int max_area = 0;

        while (left < right){
            //calculate current area
            //current height is limited by shorter height
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right -left;
            int currentArea= currentHeight * currentWidth;

            //update max area if current is larger
            max_area = Math.max(max_area, currentArea);


            //Greedy move: Move the pointer with the smaller height
            //width will decrease anyway, moving the taller pointer won't increase area, height is limited by the shorter line
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
       
     return max_area;
    }
}