package homework2;

public interface SoundMarker {
    void makeSound();
    default void callAnimal() {
        System.out.println("Все счастливы!");
    }
}
