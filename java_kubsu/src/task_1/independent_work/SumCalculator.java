package task_1.independent_work;

/**
 * Самостоятельная работа, третье задание
 */

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Проверяем количество переданных параметров
        if (args.length == 2) {
            try {
                // Преобразуем параметры в целые числа
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int sum = num1 + num2;

                // Выводим результат
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: оба параметра должны быть целыми числами.");
            }
        } else {
            // Если параметры не переданы или их больше/меньше двух, запрашиваем ввод с консоли
            Scanner scanner = new Scanner(System.in);
            System.out.print("Неверное количество параметров. Пожалуйста, введите два целых числа через пробел: ");
            String input = scanner.nextLine();
            
            // Разделяем введенные числа
            String[] inputParams = input.split("\\s+");
            if (inputParams.length != 2) {
                System.out.println("Неверное количество параметров.");
            } else {
                try {
                    // Преобразуем введенные числа в целые
                    int num1 = Integer.parseInt(inputParams[0]);
                    int num2 = Integer.parseInt(inputParams[1]);
                    int sum = num1 + num2;

                    // Выводим результат
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: оба параметра должны быть целыми числами.");
                }
            }
            scanner.close();
        }
    }
}