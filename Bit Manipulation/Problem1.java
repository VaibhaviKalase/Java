// Check if odd or even
public class Problem1{
    public static void Solution(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Solution(5);
        Solution(11);
        Solution(4);
    }
}