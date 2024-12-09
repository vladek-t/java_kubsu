package task_2;

/**
 * Первый раздел, 12 вариант
 */

import java.util.Random;

public class I_define_a_one_dimensional_array {
    public static void main(String[] args) {
        // Определяем размер массива
        int size = 10; // Вы можете изменить размер массива
        double[] array = new double[size];
        
        // Заполняем массив случайными значениями от -99 до 99
        fillArrayWithRandomValues(array);
        
        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(array);
        
        // Создаем массив обратных значений
        double[] reciprocalArray = createReciprocalFraction(array);
        
        // Выводим массив обратных значений
        System.out.println("Массив обратных значений:");
        printArray(reciprocalArray);
        
        // Находим максимальный элемент в исходном массиве
        double maxElement = findMaxElement(array);
        System.out.println("Максимальный элемент: " + maxElement);
        
        // Разделяем каждый элемент на максимальный элемент
        double[] normalizedArray = normalizeArray(array, maxElement);
        
        // Выводим нормализованный массив
        System.out.println("Нормализованный массив:");
        printArray(normalizedArray);
    }

    // Метод для заполнения массива случайными значениями
    private static void fillArrayWithRandomValues(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199) - 99; // Генерация числа от -99 до 99
        }
    }

    // Метод для создания массива обратных значений
    private static double[] createReciprocalFraction(double[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль. Элемент " + array[i] + " заменен на 0.");
                reciprocalArray[i] = 0; // Заменяем на 0 при делении на ноль
            }
        }
        return reciprocalArray;
    }

    // Метод для нахождения максимального элемента
    private static double findMaxElement(double[] array) {
        double max = array[0];
        for (double v : array) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    // Метод для нормализации массива
    private static double[] normalizeArray(double[] array, double maxElement) {
        double[] normalizedArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            normalizedArray[i] = array[i] / maxElement;
        }
        return normalizedArray;
    }

    // Метод для вывода массива
    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }
}
