// Print numbers in increasing order using recurssion
public class Problem2 {
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
}
