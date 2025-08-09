class BubbleSort{
    public static void applyBubbleSort(int arr[]){
        for(int turns = 0; turns < arr.length-1; turns++){
            boolean isSorted = false;
            for(int j = 0; j < arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted){
                System.out.println("Already sorted");
                break;
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,3,4,5};
        applyBubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}