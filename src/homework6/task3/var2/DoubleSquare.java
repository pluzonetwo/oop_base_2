package homework6.task3.var2;

public class DoubleSquare<T extends Number> implements Operation<Double>{
    @Override
    public Double exe(Double a) {
        return a * a;
    }
}
