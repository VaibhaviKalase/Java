// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user
import java.util.*;
public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of 1st Complex Number : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the imaginary part of 1st Complex Number : ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter the real part of 2nd Complex Number : ");
        int r2 = sc.nextInt();
        System.out.println("Enter the imaginary part of 2nd Complex Number : ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex add = Complex.add(c1, c2);
        add.display();

        Complex substract = Complex.substract(c1, c2);
        substract.display();

        Complex multiply = Complex.multiply(c1, c2);
        multiply.display();
    }
}
class Complex{
    int real;
    int imag;
    Complex(int r,int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex(a.real+b.real, a.imag+b.imag);
    }
    public static Complex substract(Complex a,Complex b){
        return new Complex(a.real-b.real, a.imag-b.imag);
    }
    public static Complex multiply(Complex a,Complex b){
        int realPart = a.real * b.real - a.imag * b.imag;
        int imagPart = a.real * b.imag + a.imag * b.real;
        return new Complex(realPart, imagPart);
    }
    public void display(){
        if(imag >= 0){
            System.out.println(real+"+"+imag+"i");
        }else{            
            System.out.println(real+"-"+(-imag)+"i");
        }
    }
}
