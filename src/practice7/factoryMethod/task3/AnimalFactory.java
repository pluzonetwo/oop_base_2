package practice7.factoryMethod.task3;

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name, int age);

    abstract boolean isLimitReached(); // Добавляем метод для проверки ограничения
}

