package homework1.library;

public class Book {
    private String title;
    private String author;
    private Boolean available;

    public Book(String titleValue, String authorValue, Boolean availableValue) {
        this.title = titleValue;
        this.author = authorValue;
        this.available = availableValue;
    }

    public Book(String titleValue, String authorValue) {
        this("", "", true);
    }

    public Book(String titleValue) {
        this(titleValue, "");
    }

    public Book() {
        this(null);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public Boolean getAvailable() {
        return available;
    }

    public void setTitle(String titleValue) {
        this.title = titleValue;
    }

    public void setAuthor(String titleAuthor) {
        this.author = titleAuthor;
    }

    public void setAvailable(Boolean bookAvailable) {
        this.available = bookAvailable;
    }

    public void displayInfo() {
        if (available) {
            System.out.println(title + author + " есть в библиотеке.");
        } else {
            System.out.println(title + author + " нет в библиотеке.");
        }
    }
}
