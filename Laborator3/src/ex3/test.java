package ex3;
//operatii cu numere complexe
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        ComplexNumber z1= new ComplexNumber();
        ComplexNumber z2= new ComplexNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti datele primului numar complex");
        citire(z1);
        System.out.println("Introduceti datele celui de-al doilea numar complex");
        citire(z2);
        int x=-1;
        while(x!=0){
        System.out.println("""

                Introduceti numarul care indica operatia pe care doriti sa o executati:\s
                1.Adunare
                2.Scandere
                3.Inmultire
                4.Impartire
                5.Modul
                6.Afisare
                7.Verificare daca cele doua numere sunt egale
                Iar la final introduceti 0""");
        x=scanner.nextInt();
        Operations A = new Operations();
        switch (x) {
            case 1:
                System.out.println("Rezultatul adunarii:"+A.toString(A.adunare(z1, z2)));
                break;
            case 2:
                System.out.println("Rezultatul scaderii:"+A.toString(A.scadere(z1,z2)));
                break;
            case 3:
                System.out.println("Rezultatul inmultirii: "+A.toString(A.inmultire(z1,z2)));
                break;
            case 4:
                System.out.println("Rezultatul impartirii: "+A.toString(A.impartire(z1,z2)));
                break;
            case 5:
                System.out.println("Modulul primului numar este: " + A.modul(z1) + ", iar modulul celui de-al doilea numar este: " + A.modul(z2));
                break;
            case 6:
                System.out.println(A.toString(z1)+"\n"+A.toString(z2));
                break;
            case 7:
                if(A.equals(z1,z2))
                    System.out.println("Cele doua numere sunt identice");
                else System.out.println("Cele doua numere sunt diferite");
                break;
            case 0:
                scanner.close();
                return;
        }
        }
    }
    static void citire(ComplexNumber z){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti parte reala a numarului complex: ");
        float x = scanner.nextFloat();
        z.set_re(x);
        System.out.print("Introduceti partea imaginara a numarului complex: ");
        x = scanner.nextFloat();
        z.set_im(x);
    }
}
