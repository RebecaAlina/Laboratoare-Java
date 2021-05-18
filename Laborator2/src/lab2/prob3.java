package lab2;
//returneaza minimul dintre 3 sau 4 numere, introduse de utilizator
import java.util.Scanner;

public class prob3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de numere(3 sau 4): ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.print("Iar acum introduceti cele " + number + " numere: ");
        int []array;
        array = new int[4];
        for(int i=0;i<number;i++) {
            array[i] = scanner.nextInt();
        }
        int minim;
        if (number==3)
        {minim=min3(array[0],array[1],array[2]);
            System.out.println("Minimul dintre cele 3 este: " + minim);
        }
        else if (number ==4)
        {
            minim=min4(array[0],array[1],array[2],array[3]);
            System.out.println("Minimul dintre cele 4 este: " + minim);
        }

    }
    static int min3(int a, int b, int c){
        return a < b ? a < c ? a : c : b;
    }
    static int min4(int a, int b, int c, int d){
        if (min3(a,b,c)<d)
                return min3(a,b,c);
        return d;
    }
}
