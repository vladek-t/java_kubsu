package task_2;

/**
 * Второй раздел, 12 вариант
 */

import java.util.Random;

public class II_actions_on_arrays {
    public static void main(String[] args) {
        // Определяем размер исходного массива
        int n = 10; // Вы можете изменить размер массива
        double[] originalArray = new double[n];
        
        // Заполняем массив случайными значениями от -10 до 10
        fillArrayWithRandomValues(originalArray);
        
        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(originalArray);
        
        // Создаем новый массив, содержащий ненулевые элементы, разделенные на 5
        double[] filteredArray = filterAndDivide(originalArray);
        
        // Выводим новый массив перед сортировкой
        System.out.println("Новый массив (ненулевые элементы / 5):");
        printArray(filteredArray);
        
        // Сортируем новый массив методом выбора
        selectionSort(filteredArray);
        
        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        printArray(filteredArray);
    }

    // Метод для заполнения массива случайными значениями
    private static void fillArrayWithRandomValues(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерация числа от -10 до 10
        }
    }

    // Метод для фильтрации ненулевых элементов и деления на 5
    private static double[] filterAndDivide(double[] array) {
        // Считаем количество ненулевых элементов
        int count = 0;
        for (double v : array) {
            if (v != 0) {
                count++;
            }
        }
        
        // Создаем новый массив нужного размера
        double[] filteredArray = new double[count];
        int index = 0;
        for (double v : array) {
            if (v != 0) {
                filteredArray[index++] = v / 5; // Делим ненулевой элемент на 5
            }
        }
        return filteredArray;
    }

    // Метод сортировки выбором
    private static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами текущий элемент с найденным минимальным
            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // Метод для вывода массива
    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }
}
