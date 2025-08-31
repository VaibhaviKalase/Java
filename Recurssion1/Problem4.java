// Print sum of first n natural numbers
public class Problem4 {
    public static int calNat(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + calNat(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(calNat(n));
    }
}
