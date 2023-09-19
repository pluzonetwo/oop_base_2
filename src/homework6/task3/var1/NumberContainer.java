package homework6.task3.var1;

public class NumberContainer<T extends Number> extends Square<T> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public NumberContainer() {
        this(null);
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
