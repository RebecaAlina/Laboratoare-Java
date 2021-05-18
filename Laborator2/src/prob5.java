import java.util.Scanner;
//valoarea unei functii intr-un punct dat
public class prob5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui x pentru functie: ");
        double x= scanner.nextDouble();
        if(x<0)
            System.out.println( x*x+4*x+4);
        else if(x==0)
            System.out.println("0");
        else System.out.println(x*x+5*x);
    }
}
