package Box;
class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    double getSurface(){
        return 2*width*height + 2 * width * length + 2* length * height;
    }

    double getLateralSurface(){
        return 2*width*height + 2* length * height;
    }

    double getVolume(){
        return width*height*length;
    }
}
