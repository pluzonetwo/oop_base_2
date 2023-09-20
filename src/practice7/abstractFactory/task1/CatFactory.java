package practice7.abstractFactory.task1;

// Фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
