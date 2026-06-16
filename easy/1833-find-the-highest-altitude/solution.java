/**
* Key insight: altitude[i] = prefix sum of gain[0,..i-1]
* altitude[0] = 0 (starting point, always included)
*
* we don't sore altitudes - just track the running sum and the maximum seen so far
*
* Time: 0(n) - single pass trough gain
* Space: 0(1) - no extra array
*/
class Solution {
    public int largestAltitude(int[] gain) {
       int currentAlt = 0;
       int maxAlt = 0;

       //Iterate over each net gain in the trip
       for (int g : gain){
           // Move to the next point by adding the gain (can be negative)
           currentAlt += g;
        
         //update the maximun altitude so far
         maxAlt = Math.max(maxAlt, currentAlt);
       }
       return maxAlt;
    }

}
