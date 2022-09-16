public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width * 2) + (height *2);
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean checkCollision(Rectangle other) {
        // I think I got this wrong...
        return (!(x + width < other.getX())
                && !(x > other.getX() + other.getWidth()))

                ||
                (!(y - height > other.getY())
                        && !(y < other.getY() - getHeight()));
    }

    public String toString(){
        return "x: " + x + "," +
                " y: " + y + "," +
                " width: " + width + "," +
                " height: " + height;
    }
}
