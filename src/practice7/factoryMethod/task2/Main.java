package practice7.factoryMethod.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем несколько собак с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Барон");
        Animal dog2 = dogFactory.createAnimal("Белла");

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем несколько кошек с помощью фабрики
        Animal cat1 = catFactory.createAnimal("Мурка");
        Animal cat2 = catFactory.createAnimal("Васька");

        // Выводим информацию о каждом животном
        dog1.displayInfo();
        dog1.makeSound();
        dog2.displayInfo();
        dog2.makeSound();
        cat1.displayInfo();
        cat1.makeSound();
        cat2.displayInfo();
        cat2.makeSound();

        // Выводим количество созданных животных каждого типа
        System.out.println("Количество собак: " + dog1.getCount());
        System.out.println("Количество кошек: " + cat1.getCount());
    }
}
