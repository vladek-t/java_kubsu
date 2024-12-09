package task_1;

/**
 * Первый раздел, 12 вариант
 */

import java.util.Scanner;

public class I_variables {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод двух чисел
        System.out.print("Введите первое число (a): ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число (b): ");
        double b = scanner.nextDouble();

        // Проверяем произведение
        if (a * b > 40) {
            // Вычисляем удвоенный тангенс первого числа
            double result = 2 * Math.tan(a);
            System.out.println("Удвоенный тангенс первого числа: " + result);
        } else {
            // Умножаем второе число на 4
            double result = b * 4;
            System.out.println("Второе число, умноженное на 4: " + result);
        }

        // Закрываем сканер
        scanner.close();
    }
}
