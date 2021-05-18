package ex1;

public class BookStoreCheck {
    public static boolean duplicate(Book book){
        return book.numberOfCopies==2;
    }

    public static Book numberOfPages(Book book1, Book book2){
        return book1.pageCount>book2.pageCount ? book1 : book2;
    }
}
