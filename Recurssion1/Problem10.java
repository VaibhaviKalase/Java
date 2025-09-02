// WAP to print x to the power n => Optimized version => O(logn)
public class Problem10 {
    public static int solution(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = solution(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // Odd case
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }
}
