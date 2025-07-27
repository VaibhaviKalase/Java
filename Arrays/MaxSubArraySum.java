// Brute force approach
public class MaxSubArraySum{
    public static void printMaxSubAraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int currSum = 0;
                for(int k = i ; k <= j; k++){
                    currSum += numbers[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum of subarray in given array is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3}; 
        printMaxSubAraySum(numbers);
    }
}