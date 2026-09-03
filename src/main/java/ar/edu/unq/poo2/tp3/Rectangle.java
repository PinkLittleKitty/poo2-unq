package ar.edu.unq.poo2.tp3;

public class Rectangle {
    private Point origin;
    private int width;
    private int height;


    public Rectangle(Point origin, int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point topRight, Point bottomLeft) {
        this.origin = topRight;
        this.width = topRight.getX() - bottomLeft.getX();
        this.height = bottomLeft.getY() - topRight.getY();
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * (this.width + this.height);
    }

    public Boolean isHorizontal() {
        return this.width > this.height;
    }

    public Boolean isVertical() {
        return this.height > this.width;
    }
}
