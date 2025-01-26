package objects;

public class Rectangle {
    protected double length;
    protected double width;
    protected int sides = 4;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public void print() {
        System.out.println("I am Rectangle");
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getSides() {
        return sides;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
