package Shape;

abstract class Shape {
    private double area;
    private double perimeter;

    public double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    double getPerimeter() {
        return perimeter;
    }

    void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract void calculateArea();
    abstract void calculatePerimeter();
}