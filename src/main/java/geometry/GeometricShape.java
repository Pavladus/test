package geometry;
public interface GeometricShape {
    String getFillColor();
    String getBorderColor();

    default double getPerimeter() {
        return 0;
    }

    default double getArea() {
        return 0;
    }
}