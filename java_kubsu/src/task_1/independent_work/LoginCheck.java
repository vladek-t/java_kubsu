package task_1.independent_work;

/**
 * Самостоятельная работа, четвёртое задание
 */

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        // Заранее определенные значения
        String predefinedUsername = "user";
        String predefinedPassword = "password";

        // Создаем объект Scanner для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя пользователя
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();

        // Запрашиваем пароль
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        // Проверяем соответствие введенных значений заранее определенным
        if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }

        // Закрываем сканер
        scanner.close();
    }
}
