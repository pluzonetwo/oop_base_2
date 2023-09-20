package practice7.factoryMethod.task2;

abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных
}
