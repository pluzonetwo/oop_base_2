package practice7.singletone;

class Zoo {
    // Приватное статическое поле для хранения единственного экземпляра, ссылки на класс Zoo
    private static Zoo instance;

    // Zoo instance = new Zoo();
    // Приватный конструктор, чтобы предотвратить создание экземпляров извне класса
    private Zoo() {
        // Здесь можно инициализировать ресурсы зоопарка
//         так как конструктор приватный, его нельзя нигде создать из вне. ЭТО ОЧЕНЬ ВАЖНО
    }

    // Метод для получения единственного экземпляра класса (основной)
    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    // Добавим метод для добавления животных в зоопарк
    public void addAnimal(String animal) {
        System.out.println("Добавлено животное: " + animal);
    }

    // Другие методы и данные о зоопарке
}
