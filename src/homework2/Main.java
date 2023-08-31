package homework2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(null, null);
        Owner own = new Owner();

        cat.setName(Constants.CAT_NAME);
        cat.setAge(Constants.CAT_AGE);
        own.setOwnerName("Petr");

        cat.greet();
        cat.makeSound();
        own.makeSound();
        own.callAnimal();
    }
}
