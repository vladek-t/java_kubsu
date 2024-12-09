package task_1.independent_work;

/**
 * Самостоятельная работа, второе задание
 */

import java.util.Scanner;

public class ParameterCount {
    public static void main(String[] args) {
        // Получаем количество переданных параметров
        int parameterCount = args.length;

        // Проверяем, были ли переданы параметры
        if (parameterCount > 0) {
            System.out.println("Вы ввели " + parameterCount + " параметров:");
            for (String param : args) {
                System.out.println(param);
            }
        } else {
            // Если параметры не переданы, запрашиваем ввод с консоли
            Scanner scanner = new Scanner(System.in);
            System.out.print("Вы не передавали параметры. Пожалуйста, введите параметры через пробел: ");
            String input = scanner.nextLine();
            
            // Разделяем введенные параметры и считаем их количество
            String[] inputParams = input.split("\\s+");
            parameterCount = inputParams.length;

            System.out.println("Вы ввели " + parameterCount + " параметра:");
            for (String param : inputParams) {
                System.out.println(param);
            }
            scanner.close();
        }
    }
}
