/*Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18 */

public class Problem2 {
    public static void Solution(int arr[][]){
        int sum = 0;
        for(int j = 0; j < arr[0].length; j++){
            sum += arr[1][j];
        }
        System.out.println("Sum of elements in 2nd row is "+sum);
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        Solution(nums);
    }
}
