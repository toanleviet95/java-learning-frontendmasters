package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade) {
            case "A", "B" -> "Excellent job!";
            case "C" -> {
                yield "Good job!";
            }
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
