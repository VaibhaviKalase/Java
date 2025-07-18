public class Test {
    // Factorial of a no.
    public static int factorial(int n){
        int fact=1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    // Whether the given num is Prime no. or not
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i <= n-1 ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // Optimized way
    public static boolean isPrimeNum(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // Printing prime no's in given range
    public static void printPrimeInRange(int n){
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    // Binary to decimal no. conversion
    public static void binToDec(int n){
        int pow = 0;
        int dec = 0;
        while(n != 0){
            int lastDigit = n % 10;
            n /= 10;
            dec = dec + lastDigit * (int)(Math.pow(2, pow));
            pow++;
        }
        System.out.println("The decimal no. is : "+dec);
    }

    // Decimal to binary no. conversion
    public static void decToBin(int n){
        int bin=0, pow=0;
        while (n!=0) {
            int rem = n % 2;
            n /= 2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
        }
        System.out.println("The binary no. is "+bin);
    }

    public static void main(String[] args) {
        System.out.println("Fact of number is "+factorial(5));
        System.out.println(isPrimeNum(16));
        printPrimeInRange(100);
        binToDec(1000);
        decToBin(10);
    }
}
