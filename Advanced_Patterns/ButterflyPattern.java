/*

Ps :- Print following butterfly pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
class ButterflyPattern{
    public static void printButterfly(int n){
        // Upper Half of pattern
        for(int i = 1; i <= n; i++){
            // Stars 
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half of pattern - inverted
        for(int i = n; i >= 1; i--){
            // Stars 
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printButterfly(4);
    }
}