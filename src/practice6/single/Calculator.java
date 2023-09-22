package practice6.single;

//public class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public void displayResult(int result) {
//        System.out.println("Result: " + result);
//    }
//}

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class ResultDisplay {
    public void display(int result) {
        System.out.println("Result: " + result);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ResultDisplay display = new ResultDisplay();

        display.display(calculator.add(5, 5));
    }
}
