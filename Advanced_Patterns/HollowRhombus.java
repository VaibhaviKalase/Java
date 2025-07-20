/*

PS :- Print Hollow rhombus pattern
    *****
   *   *
  *   *
 *   *
*****

 */

public class HollowRhombus {
    public static void printHollowRhombus(int n){
        // Outer loop - printing line
        for(int i = 1; i <= n; i++){
            // Inner loop1 - spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            // Inner loop2 - stars (hollow rectangle logic)
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollowRhombus(5);
    }
}
