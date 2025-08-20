// Clear i bits
public class Problem6 {
    public static int Solution(int n, int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Solution(14,2));
    }
}
