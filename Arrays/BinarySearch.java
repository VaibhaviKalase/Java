// PS :- Find the array index of an element usin binary search
public class BinarySearch {
    public static int findIndex(int numbers[], int key){
        int start = 0, end = numbers.length-1,mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("The element is at index : "+findIndex(numbers, key));
    }
}
