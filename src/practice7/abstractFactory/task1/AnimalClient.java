package practice7.abstractFactory.task1;

public class AnimalClient {
    public static void main(String[] args) {
        // Создаем фабрику для создания собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку
        Animal dog = dogFactory.createAnimal();
        System.out.println("Создано: " + dog.getName()); // Вывод: Создано: Собака

        // Создаем фабрику для создания кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем кошку
        Animal cat = catFactory.createAnimal();
        System.out.println("Создано: " + cat.getName()); // Вывод: Создано: Кошка
    }
}
