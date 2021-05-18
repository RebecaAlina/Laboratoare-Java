package ex1;

import java.util.Scanner;

public class Book {

    String title;
    String author;
    String publisher;
    int pageCount;
    int numberOfCopies;
    double price;

    public Book(){

    }
    public Book(String title,String author,String publisher,int pageCount,int numberOfCopies,double price){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        while (pageCount==0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("The page count can not be 0. Enter a number of pages greater than 0: ");
            pageCount=scanner.nextInt();
            this.pageCount=pageCount;
        }
        this.pageCount=pageCount;
        this.numberOfCopies=numberOfCopies;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Title: " + title +
                ". Author: " + author +
                ". Publisher: " + publisher;
    }
}
