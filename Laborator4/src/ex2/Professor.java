package ex2;

public class Professor extends Person{
    String subject;

    public Professor(){
        this(null,null);
    }

    public Professor(String name, String subject){
        super.name=name;
        this.subject=subject;
    }

    @Override
    public String toString(){
        return "Professor: " + super.name + ", " + subject;
    }
}
