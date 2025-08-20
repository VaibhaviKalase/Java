// Clear the bits in given range 
public class Problem7 {
    public static int Solution(int n, int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Solution(10,2,4));
    }
}
