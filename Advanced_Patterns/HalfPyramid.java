/*

PS :- Print Inverted and rotated half-pyramid pattern :- 

   *
  **
 ***
****

 */

public class HalfPyramid {
    public static void halfPyramid(int n){
            for(int i = 1; i <= n; i++){
                // Printing spaces
                for(int j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                // Printing stars
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        halfPyramid(7);
    }
}
