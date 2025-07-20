/*

PS :- Print following Solid rhombus pattern
    *****
   *****
  *****
 *****
*****

 */

public class SolidRhombus {
    public static void prinrSolidRhombus(int n){
        // Outer loop - printing lines
        for(int i = 1; i <= n; i++){
            // Spaces
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        prinrSolidRhombus(5);
    }
}
