// Swap two numbers without using any thirdvariable
public class Problem11 {
    public static void swappedNo(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("X after swapping is "+x);
        System.out.println("Y after swapping is "+y);
    }
    public static void main(String[] args) {
        swappedNo(3, 4);
    }
}
