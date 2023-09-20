package practice7.factoryMethod.task3;

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    private static final int MAX_DOGS = 3; // Максимальное количество собак
    private int createdDogs = 0; // Количество созданных собак

    @Override
    Animal createAnimal(String name, int age) {
        if (createdDogs < MAX_DOGS) {
            createdDogs++;
            return new Dog(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество собак.");
            return null; // Возвращаем null, чтобы указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdDogs >= MAX_DOGS;
    }
}
