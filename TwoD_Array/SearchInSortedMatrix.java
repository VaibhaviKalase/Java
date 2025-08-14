public class SearchInSortedMatrix {

    // Solution 1 :- This method is written when we are providing the solution based on (0,m-1)
    public static boolean solution1(int arr[][],int  key){
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){
                System.out.println("Key found at index : "+"["+row+","+col+"]");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key does not found");
        return false;
    }

    // Solution 2 :- This method is written when we are providing the solution based on (n-1,0)
    public static boolean solution2(int arr[][],int key){
        int row = arr.length-1, col = 0;
        while(row >= 0 && col < arr[0].length){
            if(key == arr[row][col]){
                System.out.println("Key found at index : "+"["+row+","+col+"]");
                return true;
            }
            else if(key < arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key does not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        solution1(arr, key);
        solution2(arr, key);
    }
}
