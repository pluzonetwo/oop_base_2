package homework1.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(null, null, false);
        Book book = new Book("Ампир V ", "Виктор Пелевин", false);
        book.displayInfo();
//        book.displayInfo();
        library.addBook("Война и мир", "Лев Толстой", true);
//        library.removeBook("Война и мир");
        library.addBook("Тихий Дон", "Михаил Шолохов", true);
        library.addBook("Судьба человека", "Михаил Шолохов", true);
        library.displayAvailableBooks();
        library.searchByAuthor("Михаил Шолохов");
    }
}
