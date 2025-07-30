// Prefix sum approach (Time complexity = O(n^2))
public class MaxSubArraySum2 {
    public static void printMaxSubAraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
        
        // Calculating prefix array
        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        // Calculating maximum sum of subarray using two loops only and the third loop is replaced with a single statement
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int currSum = i == 0 ?  prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3}; 
        printMaxSubAraySum(numbers);
    }
}
