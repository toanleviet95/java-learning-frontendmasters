package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setWidth(50);
        room1.setLength(20);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(40, 30);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The total area of both rooms: " + totalArea);
    }
}
