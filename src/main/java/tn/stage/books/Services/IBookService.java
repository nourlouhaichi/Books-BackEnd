package tn.stage.books.Services;
import tn.stage.books.Entities.Book;
import java.util.List;

public interface IBookService {

    public Book addBook(Book book, List<String> categories);
    public Book updateBook(Book book, List<String> categories);
    public void deleteBook(Long id);
    public List<Book> retreiveAllBooks();
    public Book retreiveBook(long id);

}
