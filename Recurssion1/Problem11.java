/*  Tiling problem :-  
Given a "2Xn" board and tiles of size "2X1", count the number of ways to tile the given board using the 2X1 tiles.
(A tile can either be placed horizontally or vertically.)
*/
public class Problem11 {
    public static int tilingProblem(int n){
        // Base cae
        if(n == 0 || n == 1){
            return 1;
        }

        // Vertical choice 
        int fnm1 = tilingProblem(n-1);

        // Horizontal choice 
        int fnm2 = tilingProblem(n-2);
        
        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }    
}
