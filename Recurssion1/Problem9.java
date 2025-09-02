// WAP to print x to the power n
public class Problem9 {
    public static int solution(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = solution(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
    }
}
