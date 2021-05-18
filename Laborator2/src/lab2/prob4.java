package lab2;
//caculeaza suma de bani detinuta de o persoana dupa un anumit numar de an, 25% dobanda
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ani;
        double sInitial, sNou=0;
        System.out.print("Introduceti numarul de ani pentru care se va calcula suma acumulata: ");
        ani = scanner.nextInt();
        System.out.print("Introduceti soldul initial din cont: ");
        sInitial= scanner.nextDouble();
        for (int i=1;i<=ani;i++) {
        sNou=sInitial+(float)25/100*sInitial;
        }
        System.out.println("Soldul din cont dupa " + ani + " ani va fi: " + sNou);


    }
}
