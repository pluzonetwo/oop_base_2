package homework6.task3.var1;

public class Square<T extends Number> {

    public double square(T currentValue) {
        return currentValue.doubleValue() * currentValue.doubleValue();
    }
}
