package lab2;
// radacina patrata, folosind metoda Newton

import java.util.Scanner;

public class Main {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti un numar: ");
            double number = scanner.nextDouble();
            double x=1;
            var prag=0.01;
            double x1;
            x1=(float)1/2*(x+number/x);
            while(Math.abs(x1-x)>=prag){
                x=x1;
                x1=(float)1/2*(x+number/x);
            }
            System.out.println("Radical din " + number + " este " + x);
        }

}
