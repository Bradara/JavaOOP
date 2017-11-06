package Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    final double getWidth() {
        return width;
    }

    final double getHeight() {
        return height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    @Override
    void calculateArea() {
        this.setArea(this.width * this.height);
    }

    @Override
    void calculatePerimeter() {
        this.setPerimeter(2 * this.width + 2 * this.height);
    }
}
