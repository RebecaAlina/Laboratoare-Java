package ex2;
//clasa profesor si student deriva din clasa persoana, afisare si verificare de metode.
import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args){
        Person person = new Person("Rebeca Alina");
        Person student = new Student("Chendes Rebeca", 10);
        Person professor = new Professor("Teodora Pop","Informatica");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student);
        persons.add(professor);
        for(int i=0;i<persons.size();i++){
            System.out.println(persons.get(i).toString());
        }
    }
}
