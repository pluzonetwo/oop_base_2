package practice7.factoryMethod.task3;

class Cat extends Animal {
    private static int count = 0; // Счетчик кошек
    private String name;
    private int age; // Возраст кошки

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по имени " + name + ", возраст: " + age + " лет");
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

