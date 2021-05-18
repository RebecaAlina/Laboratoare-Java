package ex6;
//operatii cu numere rationale
import ex6.NumarRational;
import ex6.Operatii;

public class test {
    public static void main(String[] args){
        NumarRational q1=new NumarRational();
        NumarRational q2= new NumarRational();
        Operatii A = new Operatii();
        A.citire(q1);
        A.citire(q2);
        System.out.print("Suma numerelor este: ");
        A.afisare(A.adunare(q1,q2));
        System.out.print("Diferenta numerelor este: ");
        A.afisare(A.scadere(q1,q2));
        System.out.print("Produsul numerelor este: ");
        A.afisare(A.produs(q1,q2));
        System.out.print("Raportul numerelor este: ");
        A.afisare(A.raport(q1,q2));

    }
}
