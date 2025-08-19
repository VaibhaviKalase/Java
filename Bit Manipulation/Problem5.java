// Update i^th bit
public class Problem5 {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return (n|bitMask);
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n&bitMask);
    }
    public static int Solution1(int n, int i, int newBit){
        // Approach 1
        if(newBit == 1){
            return setIthBit(n, i);
        }else{
            return clearIthBit(n, i);
        }
    }
    public static int Solution2(int n, int i, int newBit){
        // Approach 2
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Solution1(10,2,1));
        System.out.println(Solution2(10,2,1));
    }
}
