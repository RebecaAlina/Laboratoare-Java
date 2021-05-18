package ex4;
//genereaza un numar intreg intre 0 si 9 si calculeaza dublul sau
import java.util.Random;

public class Randomx2 {
    public static void main(String[] args){
        Random random = new Random();
            int x = random.nextInt(10);
            System.out.println("Numarul random generat: " + x + "\nDublul său:" + 2 * x);
    }
}
