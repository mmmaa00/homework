package service;

import dto.BookWithAuthorName;
import java.util.List;
import repository.BookRepository;
import entity.Book;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    public List<BookWithAuthorName> getAllBooks() {
        //xử lí nghiệp vụ
        //call repository
        try {
            return bookRepository.getAllBooks();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean deleteBook(int bookId) {
        boolean isBookExist = bookRepository.checkExist(bookId);
        if(isBookExist) {
            try {
                return bookRepository.deleteBook(bookId);
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public boolean addBook(Book book) {
        try {
            return bookRepository.addBook(book);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateBook(Book book) {
        try {
            return bookRepository.updateBook(book);
        } catch (Exception e) {
            return false;
        }
    }
}
