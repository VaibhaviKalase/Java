/* Question 3 : Write a program to Find Transpose of a Matrix. 
What is Transpose? => Transpose of a matrix is the process of swapping the rows to columns. */

public class Problem3 {
    public static void Solution(int arr[][]){
        System.out.println("The transpose of matrix is :");
        int transpose[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        printArr(transpose);
    }
    public static void printArr(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6}
        };
        Solution(arr);
    }
}
