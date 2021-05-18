package ex2;

import java.util.Scanner;
//instantiaza atributul din clasa Exemplu si afiseaza valoarea atributului inainte si dupa instantiere
public class Instantiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exemplu e1 = new Exemplu(scanner.nextInt());
        Exemplu e2 = new Exemplu(scanner.nextInt());

        e1.print();
        e2.print();

        e1.increment();
        e2.increment();

        e1.print();
        e2.print();
    }
}
