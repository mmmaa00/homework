package view;

import controller.BookController;
import dto.BookWithAuthorName;
import entity.Book;
import java.util.List;
import java.util.Scanner;

public class ViewMain {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    public ViewMain() {
        while(true) {
            System.out.println("1. Show all books");
            System.out.println("2. Delete book");
            System.out.println("3. Add book");
            System.out.println("4. Update book");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                //show all books
                    List<BookWithAuthorName> response = BookController.getInstance().getAllBooks();
                    for (int i = 0; i < response.size(); i++) {
                        System.out.println(response.get(i));
                    }
                    break;
                case 2:
                //delete book
                    System.out.println("Delete book");
                    System.out.println("Input idBook");
                    int idBook = sc.nextInt();
                    boolean result = BookController.getInstance().deleteBook(idBook);
                    if(result)
                        System.out.println("Succeed");
                    else
                        System.out.println("Failed");
                    break;
                case 3:
                //add book
                    System.out.println("Add book");
                    System.out.println("Input idBook");
                    int idNewBook = sc.nextInt();
                    System.out.println("Input nameBook");
                    String nameBook = sc1.nextLine();
                    System.out.println("Input idAuthor");
                    int idAuthor = sc.nextInt();
                    Book newBook = new Book(idNewBook, nameBook, idAuthor);
                    boolean result2 = BookController.getInstance().addBook(newBook);
                    if(result2)
                        System.out.println("Succeed");
                    else
                        System.out.println("Failed");
                    break;
                case 4:
                //update book
                    System.out.println("Update book");
                    System.out.println("Input idBook");
                    int idBook1 = sc.nextInt();
                    System.out.println("Input nameBook");
                    String nameBook1 = sc1.nextLine();
                    System.out.println("Input idAuthor");
                    int idAuthor1 = sc.nextInt();
                    Book newBook1 = new Book(idBook1, nameBook1, idAuthor1);
                    boolean result3 = BookController.getInstance().updateBook(newBook1);
                    if(result3)
                        System.out.println("Succeed");
                    else
                        System.out.println("Failed");
                    break;

            }

        }

    }
}
