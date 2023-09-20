package practice7.factoryMethod.task2;

class Cat extends Animal {
    private static int count = 0; // Счетчик кошек
    private String name;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по имени " + name);
    }

    @Override
    int getCount() {
        return count;
    }
}
