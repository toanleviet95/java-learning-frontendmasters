package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if (qualified) System.out.println("Congrats, you've been approved!");
        System.out.println("Sorry, you've been declined!");
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) return true;
        return false;
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }
}
