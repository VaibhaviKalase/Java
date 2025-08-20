// Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)
public class Problem12 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("X before adding 1 is "+x);
        // -~x => It is a way to represent x+1
        x = -~x;
        System.out.println("X after adding 1 is "+x);
    }
}
