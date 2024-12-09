package task_1;

/**
 * Третий раздел, 12 вариант
 */

import java.util.Scanner;

public class III_logical_branching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        
        System.out.println("Y = " + calculateY(x));
        System.out.println("F = " + calculateF(x));
        
        scanner.close();
    }

    public static double calculateY(double x) {
        if (x <= 0) {
            return 1 - Math.pow(x, 5) + Math.tan(8 * x);
        } else if (x <= 3) {
            return Math.pow(1 + 3, x);
        } else {
            return Math.atan(2 * x + 1);
        }
    }

    public static double calculateF(double x) {
        if (x <= 0) {
            return Math.exp(2 * x + 1);
        } else if (x <= 3) {
            return Math.pow(x, 2) - Math.sin(4 * x);
        } else {
            return Math.sqrt(Math.pow(x, 2));
        }
    }
}
