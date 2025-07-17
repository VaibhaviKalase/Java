import java.util.*;
class Patterns{
    public static void main(String as[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // Printing left-triangle
        for(int i=1;i<=n;i++){
            for(int j = 1; j <=  i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing inverted left triangle
        for(int i=1;i<=n;i++){
            for(int j = 1; j <= (n+1-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing half-pyramid pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Printing character pattern
        char ch = 'A';
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}