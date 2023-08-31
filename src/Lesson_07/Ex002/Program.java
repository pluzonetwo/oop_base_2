package Lesson_07.Ex002;

//public - методом можно пользовтаься откуда угодно
//private - доступен только внутри класса

public class Program {
//    static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//    }

    public static void main(String[] args) {
        Point2D a = new Point2D(2, 4); // создаем экземпляр класса a

        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a);
//        a.setX(12);
        Point2D b = new Point2D(6); // создаем экземпляр класса b

        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(b);
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
        
    }
}
