// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class Problem1 {
    public static boolean solution(int arr[]){
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(solution(arr));
    }
}
