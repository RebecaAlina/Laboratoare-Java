package ex2;//38 si 44, 2, 836
//cmmdc si cmmmc pentru 2 numere
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        cmm pereche = new cmm();
        System.out.print("Introduceti primul numar: ");
        pereche.a=scanner.nextInt();
        System.out.print("Introduceti si al doilea numar: ");
        pereche.b=scanner.nextInt();
        if(pereche.verificare())
        {System.out.println("Cel mai mare divizor comun al numerelor "+ pereche.a + " si " + pereche.b + " este: "+ pereche.cmmdc());
        System.out.println("Cel mai mic multiplu comun al numerelor "+ pereche.a + " si " + pereche.b + " este: "+ pereche.cmmmc());}
        else System.out.println("Nu se poate calcula cel mai mare divizor comun si cel mi mic multiplu comun pentru perechea de numere introduse!");
    }
}
