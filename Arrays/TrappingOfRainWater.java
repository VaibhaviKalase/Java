public class TrappingOfRainWater {
    
    public static int trappedRainwater(int heights[]){
        int n = heights.length;

        // Calculating leftmax boundary - left auxillary array
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = heights[0];
        for(int i = 1; i < n; i++){
            leftMaxBoundary[i] = Math.max(heights[i], leftMaxBoundary[i-1]);
        }

        // Calculating leftmax boundary - right auxillary array
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = heights[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(heights[i],rightMaxBoundary[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i < n; i++){
            // waterLevel = min(leftMaxBoundary,rightMaxBoundary)
            int waterLevel = Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);

            // trappedWater = waterLevel - heights[i]
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int heights [] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rainwater is "+trappedRainwater(heights));
    }
}
