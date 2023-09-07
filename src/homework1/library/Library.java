package homework1.library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library extends Book {
    private ArrayList<Book> catalog = new ArrayList<>();
    public Library(String titleValue, String authorValue, Boolean availableValue) {
        super(titleValue, authorValue, availableValue);
    }


    public ArrayList<Book> addBook(String titleValue, String authorValue, Boolean availableValue) {
        catalog.add(new Book(titleValue, authorValue, availableValue));
        return catalog;
    }

    public ArrayList<Book> removeBook(String titleValue) {
        catalog.removeIf(book -> titleValue.equals(book.getTitle()));
        return catalog;
    }

    public void displayAvailableBooks() {
        for (var book : catalog) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }

    public void searchByAuthor(String authorName) {
        for (var book : catalog) {
            if (authorName.equals(book.getAuthor())) {
                System.out.println(book.getTitle());
            }
        }
    }
}
