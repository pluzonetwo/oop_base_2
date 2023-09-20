package practice7.factoryMethod.task1;

// Конкретный класс для создания собак
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Собака гавкает");
    }
}
