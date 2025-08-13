// Question :Use the following sorting algorithms to sort an array in DESCENDING order :a.Bubble Sort b.Selection Sort c.Insertion Sort d.Counting Sort [3,6,2,1,8,7,4,5,3,1]

public class Assignment {
    // a. Bubble Sort
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // b. Selection Sort
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int maxPos = i;
            for(int j = i+1; j < arr.length; j++){
               if(arr[maxPos] < arr[j]){
                maxPos = j;
               } 
            }
            if(maxPos != i){
                int temp = arr[maxPos];
                arr[maxPos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // c. Insertion Sort
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            } 
            arr[prev+1] = curr;
        }
    }

    // d. Count Sort
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int countArr[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            countArr[arr[i]]++;
        }
        int j = 0;
        for(int i = countArr.length-1 ; i >= 0; i--){
            while(countArr[i] > 0){
                arr[j] = i;
                countArr[i]--;
                j++;
            }
        }
    }

    // Printing aarray
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countSort(arr);
        printArr(arr);
    }
}
