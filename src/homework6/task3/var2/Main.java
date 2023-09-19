package homework6.task3.var2;
/***
 * в данном примере применен метод Open CLosed
 */
public class Main {
    public static void main(String[] args) {
        Perform perform = new Perform();
        perform.executeOperation(new Square<>(), 5);
        perform.executeOperation(new DoubleSquare<>(), 5.5);
    }
}
