package Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    final double getRadius() {
        return radius;
    }

    @Override
    void calculateArea() {
        this.setArea(Math.PI * this.radius* this.radius);
    }

    @Override
    void calculatePerimeter() {
        this.setPerimeter(Math.PI * this.radius * 2);
    }
}
