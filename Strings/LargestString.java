// Problem statement :- For a given set of strings, print the largest string(Lexicographically)
public class LargestString{
    public static String getLargest(String fruits[]){
        String largest = fruits[0];
        for(int i = 0; i < fruits.length; i++){
            if((largest.compareToIgnoreCase(fruits[i])) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"Apple", "Mango", "Banana"};
        System.out.println(getLargest(fruits));
    }
}