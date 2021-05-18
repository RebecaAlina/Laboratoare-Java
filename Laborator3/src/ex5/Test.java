package ex5;
//creeaza cursuri si lista de studenti de la curs, apoi in ordoneaza dupa nume in functie de an
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doriti sa creati un curs? (D/N)");
        String ok =scanner.next();
    while(ok.equals("D") || ok.equals("d")){
        Course c1 = new Course();
        System.out.println("Introduceti numarul studentilor care participa la cursul "+c1.get_description());
        int no;
        no = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();

        for(int i=0;i<no;i++)
        {
            System.out.println("Date despre studentul cu numarul " + (i+1));
            Student s1 = new Student();
            students.add(s1);
            s1=null;

        }
    c1.set_array(students);
        System.out.println("Introduceti anul din care doriti sa vizualizati studentii: ");
        int x = scanner.nextInt();
        System.out.println("Studentii din anul " + x + " sortati dupa nume: " );
        System.out.println(c1.filterByYear(x,students));
        System.out.println("Doriti sa mai creati un curs? (D/N)");
        ok =scanner.next();
    }
        System.out.println("Operatiune incheiata!");
    }

}
