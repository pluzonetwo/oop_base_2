package practice5;

import practice5.calculator.CalculatorModel;
import practice5.controller.CalculatorController;
import practice5.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

//        double num1 = 10;
//        double num2 = 5;
//        char operator = '+';

        controller.calculate(10, 5, '*');
    }
}
