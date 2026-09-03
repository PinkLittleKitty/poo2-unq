package ar.edu.unq.poo2.tp3;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void movePointTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public Point add(Point other) {
        return new Point(this.x + other.getX(), this.y + other.getY());
    }
}
