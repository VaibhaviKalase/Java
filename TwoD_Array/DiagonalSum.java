public class DiagonalSum {
    public static int calDiagonalSum(int arr[][]){
        int sum = 0;

        // Brute Force Approach
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    // Primary diagonal elements
                    sum += arr[i][j];
                }
                else if(i+j == arr.length-1){
                    // Secondary diagonal elements
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int optimedAns(int arr[][]){
        int sum = 0;
        // Optimized approach
        for(int i = 0; i < arr.length; i++){
            // 1. Primary diagonal element
            sum += arr[i][i];

            // 2. Secondary diagonal element
            // The condition is added because we don't want to add common elements that were present during the calculation of primary element.
            if(i != arr.length-1-i)
                sum += arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println("The sum of diagonal element is : "+calDiagonalSum(arr));
        System.out.println("The sum of diagonal element is : "+optimedAns(arr));
    }
}
