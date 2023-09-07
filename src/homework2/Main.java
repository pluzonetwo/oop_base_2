package homework2;

public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);

        cat.greet();
        cat.makeSound();
        cat.makeStep();
        cat.careAnimal();
        cat.callAnimal();
    }
}
