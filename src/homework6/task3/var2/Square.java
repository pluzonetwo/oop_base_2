package homework6.task3.var2;

public class Square<T extends Number> implements Operation<Integer> {
    @Override
    public Integer exe(Integer a) {
        return a * a;
    }
}
