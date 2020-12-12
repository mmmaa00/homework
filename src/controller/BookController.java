package controller;
import entity.Book;
import dto.BookWithAuthorName;
import java.util.List;
import service.BookService;

public class BookController {
    private  static BookController instance;
    BookService bookService = new BookService();
    public static BookController getInstance() {
        if(instance == null) {
            instance = new BookController();
        }
        return instance;
    }

    private BookController() {
    }

    public List<BookWithAuthorName> getAllBooks() {
        return bookService.getAllBooks();
    }

    public boolean deleteBook(int bookId) {
            return bookService.deleteBook(bookId);
    }

    public boolean addBook(Book book) {
        return bookService.addBook(book);
    }

    public boolean updateBook(Book book) {
        return bookService.updateBook(book);
    }
}
