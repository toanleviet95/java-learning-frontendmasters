package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRooms(room1, room2);

        System.out.println("The total area of both rooms: " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length:");
        double length = this.scanner.nextDouble();
        System.out.println("Enter the width:");
        double width = this.scanner.nextDouble();
        return new Rectangle(length, width);
    }

    public double calculateAreaOfRooms(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
