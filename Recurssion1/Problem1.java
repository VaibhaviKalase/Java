// Print numbers in decreasing order using recurssion
class Problem1{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String as[]){
        int n = 10;
        printDec(n);
    }
}