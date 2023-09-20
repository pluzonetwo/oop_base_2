package practice7.factoryMethod.task2;

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Dog(name);
    }
}
