/*  Problem statemet :- Question 1 : Print the number of 7’s that are in the 2d array.
Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2 */

public class Problem1 {
    public static void Solution(int array[][]){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("The no. of sevens are : "+count);
    }
    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        Solution(array);
    }
}