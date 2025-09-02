// WAP to find last occurence of an element in an array
public class Problem8 {
    public static int solution(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
       int isFound = solution(arr, key, i+1);
       if(isFound == -1 && arr[i] == key){
        return i;
       }
        return isFound;
    }
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,7,6,5};
        System.out.println(solution(arr, 5, 0));
    }
}
