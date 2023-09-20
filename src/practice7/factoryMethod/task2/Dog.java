package practice7.factoryMethod.task2;

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private String name;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по имени " + name);
    }

    @Override
    int getCount() {
        return count;
    }
}
