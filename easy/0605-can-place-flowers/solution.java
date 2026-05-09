class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int counter = 0;
    //For the first and last elements, we need not check the previous and the next adjacent positions respectively.    
        for (int i= 0; i < flowerbed.length; i++){
            // Check if the current plot is empty.
            if (flowerbed[i] == 0){
               // Check if the left & right plots are empty
               boolean emptyLeftPlot = (i ==0) || (flowerbed[i-1] == 0);
               boolean emptyRightPlot = (i == flowerbed.length -1) || (flowerbed[i +1] == 0);

               // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    counter++;
                    if(counter >= n) {
                        return true;
                    }
                }
            }
        }
        return counter >= n;
    }
}