package task_1.independent_work;

/**
 * Самостоятельная работа, первое задание
 */

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args) 
	{
        // Создаем объект Scanner для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя у пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Проверяем, введено ли имя
        if (!name.isEmpty()) 
        {
            // Если имя введено, выводим "Hello " + имя
            System.out.println("Hello " + name);
        } 
        else 
        {
            // Если имя не введено, выводим "Hello world"
            System.out.println("Hello world");
        }

        // Закрываем сканнер
        scanner.close();
    }
}
