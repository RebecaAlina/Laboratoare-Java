package ex2;

public class Student extends Person {
    int grade;

    public Student(){
        this(null,0);
    }
    public Student(String name, int grade){
        super.name=name;
        this.grade=grade;
    }

    @Override
    public String toString(){
        return "Student: " + super.name + ", " + grade;
    }

    public boolean equals(Student student){
        return this.grade==student.grade && super.name.equals(student.name);
    }

}
