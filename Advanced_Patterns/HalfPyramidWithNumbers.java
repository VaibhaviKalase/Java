/*

PS :- Print Inverted half pyramid patterns with numbers
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 */
public class HalfPyramidWithNumbers {
    public static void print_half_inverted_pyramid_withNumbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_half_inverted_pyramid_withNumbers(5);
    }
}
