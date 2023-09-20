package practice7.factoryMethod.task3;

abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных

    abstract int getAge(); // Добавляем метод для получения возраста животного
}

