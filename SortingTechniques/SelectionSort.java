public class SelectionSort {
    public static void applySelectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            boolean isSwapped = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            // Swap only when needed
            if(minPos != i){
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
                isSwapped = true;
            }

            if(isSwapped == false){
                System.out.println("Already sorted");
                break;
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,3,4,5};
        applySelectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
