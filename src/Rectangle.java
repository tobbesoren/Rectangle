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
       // I'm using these variables to make the logic part easier to read
        double thisLeftSide = this.x;
        double thisRightSide = this.x + this.width;
        double thisTopSide = this.y;
        double thisBottomSide = this.y - this.height;

        double otherLeftSide = other.getX();
        double otherRightSide = other.getX() + other.getWidth();
        double otherTopSide = other.getY();
        double otherBottomSide = other.getY() - other.getHeight();

        // Checking if any rectangle is to the right of the other; if so, they don't overlap and false is returned.
        if(thisLeftSide > otherRightSide || otherLeftSide > thisRightSide) {
            return false;

        // Checking if any rectangle is below the other; if so, they don't overlap and false is returned .
        } else if(thisTopSide < otherBottomSide || otherTopSide < thisBottomSide) {
            return false;

        // If none of the other conditions where fulfilled, then the rectangles overlap and true is returned.
        } else {
            return true;
        }
    }
    public String toString(){
        return "x: " + x + "," +
                " y: " + y + "," +
                " width: " + width + "," +
                " height: " + height;
    }
}
