package homework7;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, -1);

        Complex sum = a.add(b);
        System.out.println(sum);
    }
}
