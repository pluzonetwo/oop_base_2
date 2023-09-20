package practice7.singletone;
//паттерн полезен тем, что мы можем гаранитировать классу только ОДИН экземпляр,
// при этом предоставив ему доступ из любой точки программы
public class Main {
    public static void main(String[] args) {
        // Получаем единственный экземпляр зоопарка
        Zoo zoo = Zoo.getInstance();

        // Добавляем животных в зоопарк
        zoo.addAnimal("Лев");
        zoo.addAnimal("Зебра");
        zoo.addAnimal("Слон");

        // Получаем еще раз тот же экземпляр зоопарка
        Zoo sameZoo = Zoo.getInstance();

        // Проверяем, что это действительно один и тот же объект
        if (zoo == sameZoo) {
            System.out.println("Это один и тот же зоопарк!");
        }
    }
}
