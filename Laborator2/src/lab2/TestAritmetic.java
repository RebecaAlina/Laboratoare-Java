package lab2;
//genereaza 2 numere aleatorii si efectueaza operatii cu ele
import java.util.Random;

public class TestAritmetic {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1000);
        int b = random.nextInt(1000);
        System.out.println("Primul numar este: " + a);
        System.out.println("Al doilea numar este: " + b);
        int suma = a+b;
        int diferenta = a-b;
        int produs = a * b;
        int impartire = a / b;
        int rest= a % b;
        System.out.println("Suma numerelor este: " + suma);
        System.out.println("Diferenta numerelor este: " + diferenta);
        System.out.println("Produsul numerelor este: " + produs);
        System.out.println("Impartirea intreaga a numerelor este: " + impartire);
        System.out.println("Restul impartirii celor doua numere este: " + rest);


    }
}
