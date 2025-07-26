// PS :- Find the array index of an element usin linear search
public class LinearSearch{
    public static int findIndex (int arr[],int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String as[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = findIndex(arr,key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Element is at index : "+index);
        }
    }
}