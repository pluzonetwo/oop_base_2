package practice7.factoryMethod.task2;

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name);
}
