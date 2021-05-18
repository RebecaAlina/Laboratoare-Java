package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    ArrayList<Book> books;

    public Bookstore(){
    }
    public Bookstore(ArrayList<Book> books){
        this.books=books;
    }
    public void addBook(Book book){
        boolean ok=true;
        for(int i=0;i<books.size();i++) {
            if(books.get(i).equals(book)) {
                books.get(i).numberOfCopies++;
                ok=false;
            }
        }
            if(ok)
                books.add(book);
        }
    public void removeBook(Book book){
        books.remove(book);
    }

    public void filterByTitle(){
        System.out.println("The title you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).title.equals(title))
                System.out.println(books.get(i));
        }
    }

    public void filterByAutor(){
        System.out.println("The author you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).author.equals(author))
                System.out.println(books.get(i));
        }
    }

    public void filterByPublisher(){
        System.out.println("The publisher you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        String publisher = scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).publisher.equals(publisher))
                System.out.println(books.get(i));
        }
    }

    public void filterByPageCount(){
        System.out.println("The number of pages you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        int pageCount = scanner.nextInt();
        for(int i=0;i<books.size();i++){
            if(books.get(i).pageCount==pageCount)
                System.out.println(books.get(i));
        }
    }

    public void filterByNumberOfCopies(){
        System.out.println("The number of copies you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCopies  = scanner.nextInt();
        for(int i=0;i<books.size();i++){
            if(books.get(i).numberOfCopies==numberOfCopies)
                System.out.println(books.get(i));
        }
    }

    public void filterByPrice(){
        System.out.println("The price you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        int price  = scanner.nextInt();
        for(int i=0;i<books.size();i++){
            if(books.get(i).price==price)
                System.out.println(books.get(i));
        }
    }

}
