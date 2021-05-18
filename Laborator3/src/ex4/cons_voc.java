package ex4;
//afiseaza numarul de vocale si consoane dintr-un sir, apoi afiseaza pozitiile unei litere introduse de utilizator
import java.util.Scanner;

public class cons_voc {
    public static void main(String[] args){
        int consoane=0,vocale=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de caractere: ");
        String x = scanner.nextLine();
        char[] str=x.toCharArray();
        String voc = "aeiou";
        for(int i=0;i<str.length;i++)
        {
            str[i]=Character.toLowerCase(str[i]);
            if(voc.indexOf(str[i])>=0 && Character.compare(str[i],' ')!=0)
            vocale++;

            else if(voc.indexOf(str[i])<0 && Character.compare(str[i],' ')!=0)
                consoane++;
        }
        System.out.println("Numarul de consoane: "+ consoane);
        System.out.println("Numarul de vocale: "+vocale);

        //System.out.println(str);

        System.out.println("Introduceti o vocala pe care doriti sa o cautati: ");
        char c =scanner.next().charAt(0);
        System.out.println("Pozitiile pe care se afla litera cautata: ");
        for(int i=0;i<str.length;i++){
            if(Character.compare(str[i],c)==0)
                System.out.print((i+1)+ " ");
        }
    }

}
