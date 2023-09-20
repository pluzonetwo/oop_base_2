package practice7.abstractFactory.task1;

// Фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
