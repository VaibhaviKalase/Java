public class CountSort {
    public static void applyCountSort(int arr[]){
        // Find the largest element => so we know the range of our counting array.
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array of size largest+1 → each index represents a number, and the value at that index is how many times it appears.
        int count[] = new int[largest+1];
        // Fill the count array → increment count for each number in arr.
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        // Overwrite the original array → for each number i in count[], insert i into arr as many times as its count.
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                count[i]--;
                j++; 
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        applyCountSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
