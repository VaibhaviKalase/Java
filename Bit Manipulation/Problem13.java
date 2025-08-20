// This question is based on a trick, pleasedirectly look at the solution.Convert uppercase characters to lowercase using bits.
public class Problem13 {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' ')+" ");
        }
    }
}
