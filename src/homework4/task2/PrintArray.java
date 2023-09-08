package homework4.task2;

public class PrintArray {
    public <T> void printArray(T[] list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
