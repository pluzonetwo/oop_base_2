package practice7.factoryMethod.task3;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем несколько собак с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Барон", 3);
        Animal dog2 = dogFactory.createAnimal("Белла", 2);
        Animal dog3 = dogFactory.createAnimal("Рекс", 4);

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем несколько кошек с помощью фабрики
        Animal cat1 = catFactory.createAnimal("Мурка", 5);
        Animal cat2 = catFactory.createAnimal("Васька", 4);
        Animal cat3 = catFactory.createAnimal("Лиза", 2);

        // Выводим информацию о каждом животном
        dog1.displayInfo();
        dog1.makeSound();
        dog2.displayInfo();
        dog2.makeSound();
        dog3.displayInfo();
        dog3.makeSound();
        cat1.displayInfo();
        cat1.makeSound();
        cat2.displayInfo();
        cat2.makeSound();
        cat3.displayInfo();
        cat3.makeSound();

        // Выводим количество созданных животных каждого типа и их возраст
        System.out.println("Количество собак: " + dog1.getCount());
        System.out.println("Количество кошек: " + cat1.getCount());
        System.out.println("Возраст собак: " + dog1.getAge() + ", " + dog2.getAge() + ", " + dog3.getAge());
        System.out.println("Возраст кошек: " + cat1.getAge() + ", " + cat2.getAge() + ", " + cat3.getAge());
    }
}
