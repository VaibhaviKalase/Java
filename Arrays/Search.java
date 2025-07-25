// Find the largest and smallest number in an array

import java.util.*;
public class Search {

    public static void findNum(int num[]){

        // Storing smallest possible number for further comparison.
        int largest = Integer.MIN_VALUE;
        // Storing largest possible number for further comparison.
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
            if(num[i] < smallest){
                smallest = num[i];
            } 
        }

        System.out.println("The largest number in an given array is : "+largest);
        System.out.println("The smallest number in an given array is : "+smallest);
    }
    public static void main(String[] args) {
        int num []= {23,12,6,34,1,98,2};
        findNum(num);
    }
}
