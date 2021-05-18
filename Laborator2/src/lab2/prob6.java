package lab2;
//factorial recursiv
import java.util.Scanner;

public class prob6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar pentru care sa se calculeze factorialul: ");
        int x = scanner.nextInt();
        System.out.println("Factorialul lui " + x + " este: " + factorial(x));
    }
    static int factorial(int x){
        if(x==0) return 1;
        else return x*factorial(x-1);
    }
}
