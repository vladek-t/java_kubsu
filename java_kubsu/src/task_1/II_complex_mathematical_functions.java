package task_1;

/**
 * Второй раздел, 12 вариант
 */

import java.util.Scanner;

public class II_complex_mathematical_functions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Find the maximum and minimum values
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // Calculate d
        double d = ((Math.pow(max, 5) - 3.2 * min) / (1 + min));

        // Output the result
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("d = " + d);
    }
}
