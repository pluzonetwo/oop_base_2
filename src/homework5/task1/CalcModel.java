package homework5.task1;

public class CalcModel {
    public double sumNumbers(double value1, double value2) {
        return value1 + value2;
    }
    public double substractNumbers(double value1, double value2) {
        return value1 - value2;
    }
    public double multiplNumbers(double value1, double value2) {
        return value1 * value2;
    }
    public double divNumbers(double value1, double value2) {
        if (value2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }else {
            return value1 / value2;
        }
    }
}
