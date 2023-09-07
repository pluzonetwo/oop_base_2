package homework1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Барсик");
        cat.setAge(5);
        cat.setOwnerName("Петр");

        cat.greet();
    }
}
