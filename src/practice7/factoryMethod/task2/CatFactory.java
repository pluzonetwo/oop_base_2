package practice7.factoryMethod.task2;

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Cat(name);
    }
}
