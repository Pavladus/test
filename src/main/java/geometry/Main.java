package geometry;

public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = {
                new Circle(5, "红ный", "черный"),
                new Rectangle(4, 6, "синий", "зеленый"),
                new Triangle(3, 4, 5, "желтый", "черный")
        };

        for (GeometricShape shape : shapes) {
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
            System.out.println("-----");
        }
    }
}
