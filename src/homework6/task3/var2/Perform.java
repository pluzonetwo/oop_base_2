package homework6.task3.var2;

public class Perform {
    public <T> void executeOperation(Operation<T> operation, T a) {
        System.out.println(operation.exe(a));
    }
}
