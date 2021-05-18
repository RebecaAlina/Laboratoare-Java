package ex2;

public class Person {
    String name;

    public Person(){
        this(null);
    }
    public Person(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Name: "+name;
    }
}
