package repository;
import dto.BookWithAuthorName;
import java.util.ArrayList;
import java.util.List;
import entity.Book;
public class BookRepository {
    List<BookWithAuthorName> listBooks;
    List<Book> list;
    public BookRepository() {
        listBooks = new ArrayList<>();
        BookWithAuthorName book1 = new BookWithAuthorName();
        book1.id = 0;
        book1.name = "sach1";
        book1.authorId = 1;
        book1.authorName = "Thang";

        BookWithAuthorName book2 = new BookWithAuthorName();
        book2.id = 1;
        book2.name = "sach2";
        book2.authorId = 2;
        book2.authorName = "Thien";

        listBooks.add(book1);
        listBooks.add(book2);
    }

    public List<BookWithAuthorName> getAllBooks() {
        return listBooks;
    }

    public boolean checkExist(int id) {
        for (int i = 0; i < listBooks.size(); i++) {
            if(listBooks.get(i).getId() == id)
                return  true;
        }
        return false;
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i < listBooks.size(); i++) {
            if(listBooks.get(i).getId() == bookId)
                listBooks.remove(listBooks.get(i));
        }
        return true;
    }

    public boolean addBook(Book book) {
        list.add(book);
        return true;
    }

    public boolean updateBook(Book book) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == book.id) {
                list.get(i).setId(book.getId());
                list.get(i).setName(book.getName());
                list.get(i).setAuthorId(book.getAuthorId());
            }
        }
        return true;
    }
}
