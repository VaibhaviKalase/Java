// Question 4 : Determine if 2 Strings are anagrams of each other.
import java.util.*;
public class Problem2 {
    public static void solution(String str1, String str2){
        // Lowercase both the strings
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if these strings are of equal length
        if(str1.length() == str2.length()){
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            // Sort this array
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            // Check if the arrays are eqaul or not
            boolean result = Arrays.equals(str1Array,str2Array);

            if(result){
                System.out.println("Strings are anagrams of each other");
            }else{
                System.out.println("Strings are not anagrams of each other");
            }
        }else{
            System.out.println("Strings are not anagrams of each other because their length is not same");
        }
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        solution(str1,str2);
    }
}
