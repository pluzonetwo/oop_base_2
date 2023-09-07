package homework3.base_task;

public interface SoundMarker {
    void makeSound();
    default void callAnimal() {
        System.out.println("Все счастливы!");
    }
}
