package ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Course {
    String title;
    String description;
    ArrayList<Student> array;

    public Course(){
        System.out.println("Intrduceti numele cursului: ");
        Scanner scanner = new Scanner(System.in);
        this.title=scanner.nextLine();
        System.out.println("Introduceti descrierea cursului: ");
        this.description=scanner.nextLine();
        array=null;
    }
    public Course(String title, String description, ArrayList<Student> array){
        this.title=title;
        this.description=description;
        this.array=array;
    }
    public void set_title(String title){this.title=title;}
    public void set_description(String description){this.description=description;}
    public void set_array(ArrayList<Student> array){this.array=array;}
    public String get_title(){return title;}
    public String get_description(){return description;}
    public ArrayList<Student> get_array(){return array;}

    public ArrayList<Student> filterByYear(int yeark, ArrayList<Student> students){
        ArrayList<Student> array_sorted = new ArrayList<>();
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).year==yeark)
                array_sorted.add(students.get(i));
        }
        Collections.sort(array_sorted);
        return array_sorted;
    }


}
