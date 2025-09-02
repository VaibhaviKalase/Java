// WAP to find the first occurence of an element in an array
public class Problem7 {
    public static int solution(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return solution(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {3,5,6,4,6,7,8};
        System.out.println(solution(arr, 4, 0));
    }
}
