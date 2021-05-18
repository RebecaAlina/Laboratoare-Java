package ex1;
//aplicatie pentru gestiunea unui magazin de carti
import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args){
           Book b1 = new Book("Istorie","Ion Pop","Editura Art", 100,5, 25.5);
           Book b2 = new Book("Geografie","Vasile Cioban","Editura Art",120,2,25.5);
           Book b3 = new Book("Matematici speciale","Ion Pop","Editura Milenium",120,7,30);
           Book b4 = new Book("Algebra","Daniel Antonio","Editura UTCN",60,5,20);
           Book b5 = new Book("Chimie","Teodora Vasilescu","Editura UTCN",100,7,20);
           Book b6 = new Book("Chimie anorganica","Teodora Vasile","Editura UTCN",100,7,20);
           ArrayList<Book> books = new ArrayList<Book>();

           books.add(b1);
           books.add(b2);
           books.add(b3);
           books.add(b4);
           books.add(b5);

           Bookstore BookStore = new Bookstore(books);
           BookStore.addBook(b6);
           System.out.println(BookStore.books);
           BookStore.filterByPageCount();
           System.out.println(BookStoreCheck.duplicate(b2));
           System.out.println(BookStoreCheck.numberOfPages(b3,b5));

    }
}
