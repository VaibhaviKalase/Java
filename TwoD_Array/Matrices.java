import java.util.*;
public class Matrices{
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // Finding largest element
    public static void largestKey(int matrix[][]){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                maxNum = Math.max(maxNum,matrix[i][j]);
            }
        }
        System.out.println("The largest number in array is "+maxNum);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // search(matrix,5);
        largestKey(matrix);
    }
}