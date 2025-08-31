// Print Nth fibonacci number 
public class Problem5 {
    public static int fibNum(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibNum(n-1);
        int fnm2 = fibNum(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fibNum(3));
    }
}
