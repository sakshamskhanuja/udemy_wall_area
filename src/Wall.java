public class Wall {

    // Instance fields.
    private double width;
    private double height;

    // Default Constructor.
    public Wall() {
        this (0, 0);
    }

    // Parameterized Constructor.
    public Wall(double width, double height) {
        // Checks for invalid value.
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    // Getter methods.
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods.
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return height * width;
    }
}
