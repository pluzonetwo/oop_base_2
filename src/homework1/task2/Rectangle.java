package homework1.task2;

class Rectangle {
    private Integer width = 20;
    private Integer height = 10;

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer calculateArea() {
        return width * height;
    }

    public Integer calculatePerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        System.out.println(
                "Высота прямоугольника: " + height + "\n" +
                        "Ширина прямоугольника: " + width + "\n" +
                        "Площадь прямоугольника: " + calculateArea() + "\n" +
                        "Периметр прямоугольника: " + calculatePerimeter());
    }
}