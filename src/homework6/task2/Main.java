package homework6.task2;

import homework6.task2.Pair;
/***
 * Главный класс для демонстрации работы с классом Pair.
 */
public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(42, "Привет");
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);

        pair1.printTypes();
        // Вывод:
        // Тип первого элемента: java.lang.Integer
        // Тип второго элемента: java.lang.String

        pair2.printTypes();
        // Вывод:
        // Тип первого элемента: java.lang.Double
        // Тип второго элемента: java.lang.Boolean
    }
}
