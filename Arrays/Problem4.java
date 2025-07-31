// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]

public class Problem4 {
    public static void Solution(int height[]){
        int n = height.length;

        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i-1],height[i]);
        }

        int rightMaxBoundary[] = new int[height.length];
        rightMaxBoundary[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i+1],height[i]);
        }

        int trappedRainwater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedRainwater += waterLevel - height[i];
        }
        System.out.println("Trapped rainwater is "+trappedRainwater);
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution(height);
    }
}
