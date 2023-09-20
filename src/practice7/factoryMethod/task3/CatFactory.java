package practice7.factoryMethod.task3;

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    private static final int MAX_CATS = 3; // Максимальное количество кошек
    private int createdCats = 0; // Количество созданных кошек

    @Override
    Animal createAnimal(String name, int age) {
        if (createdCats < MAX_CATS) {
            createdCats++;
            return new Cat(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество кошек.");
            return null; // Возвращаем null, чтобы указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdCats >= MAX_CATS;
    }
}
