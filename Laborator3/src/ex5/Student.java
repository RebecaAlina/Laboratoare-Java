package ex5;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    String name;
    int year;

    public Student(){
        System.out.println("Introduceti numele studentului: ");
        Scanner scanner = new Scanner(System.in);
        this.name=scanner.nextLine();
        System.out.println("Introduceti anul de studii al studentului: ");
        this.year=scanner.nextInt();
    }

    public Student(String name, int year){
        this.name=name;
        this.year=year;
    }

    public void set_name(String name){
        this.name=name;
    }
    public void set_year(int year){
        this.year=year;
    }
    public int get_year(){
        return year;
    }
    public String get_name(){
        return name;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", year:" + year;
    }

    public boolean equals(Student s){
        return this.name.equals(s.name) && (this.year == s.year);
    }
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}
