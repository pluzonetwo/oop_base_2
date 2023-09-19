package homework5.task1;

import java.util.Scanner;

public class CalcView {

    public double userInputOne() {
        double value1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый операнд: ");
        if (sc.hasNextDouble()) {
            value1 = sc.nextDouble();
        }else {
            throw new ArithmeticException("Введите число!");
        }
        return value1;
    }
    public double userInputTwo() {
        double value2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите второй операнд: ");
        if (sc.hasNextDouble()) {
            value2 = sc.nextDouble();
            sc.close();
        }else {
            throw new ArithmeticException("Введите число!");
        }
        return value2;
    }
    public String userInputOp() {
        String operator = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оператор: ");
        if (sc.hasNextLine()) {
            operator = sc.nextLine();
        }
        return operator;
    }
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    public void printError(String errMsg) {
        System.out.println("Ошибка: " + errMsg);
    }

}
