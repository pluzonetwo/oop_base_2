package practice7.factoryMethod.task1;

//отделяем создание объектов от их использования

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку с помощью фабрики
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Вывод: Собака гавкает

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем кошку с помощью фабрики
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Вывод: Кошка мяукает
    }
}
