// Friends Pairing Problem :- Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class Problem13 {
    public static int friendsPairing(int n){
        // Base Confdition
        if(n==1 || n==2){
            return n;
        }
        // Single choice
        int fnm1 = friendsPairing(n-1);
        // Pair choice 
        int pairChoice = (n-1) * friendsPairing(n-2);
        int totalWays = fnm1 * pairChoice;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
