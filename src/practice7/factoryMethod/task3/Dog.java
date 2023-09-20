package practice7.factoryMethod.task3;

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private String name;
    private int age; // Возраст собаки

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по имени " + name + ", возраст: " + age + " лет");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    int getAge() {
        return age;
    }
}
