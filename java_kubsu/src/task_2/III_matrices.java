package task_2;

/**
 * Третий раздел, седьмой вариант
 */

import java.util.Random;

public class III_matrices {
    public static void main(String[] args) {
        // Определяем размеры матрицы
        int rows = 5; // Количество строк
        int cols = 4; // Количество столбцов
        double[][] matrix = new double[rows][cols];

        // Заполняем матрицу случайными значениями от -10 до 10
        fillMatrixWithRandomValues(matrix);

        // Выводим матрицу
        System.out.println("Сгенерированная матрица:");
        printMatrix(matrix);

        // Создаем вектор B, содержащий произведение положительных элементов в каждом столбце
        double[] vectorB = calculatePositiveProduct(matrix);

        // Выводим вектор B
        System.out.println("Вектор B (произведение положительных элементов в каждом столбце):");
        printArray(vectorB);
    }

    // Метод для заполнения матрицы случайными значениями
    private static void fillMatrixWithRandomValues(double[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // Генерация числа от -10 до 10
            }
        }
    }

    // Метод для вычисления произведения положительных элементов в каждом столбце
    private static double[] calculatePositiveProduct(double[][] matrix) {
        double[] productArray = new double[matrix[0].length];

        // Инициализируем массив произведений единицей
        for (int j = 0; j < productArray.length; j++) {
            productArray[j] = 1;
        }

        // Проходим по каждому столбцу
        for (int j = 0; j < matrix[0].length; j++) {
            boolean hasPositive = false; // Флаг для проверки наличия положительных элементов
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > 0) {
                    productArray[j] *= matrix[i][j];
                    hasPositive = true;
                }
            }
            // Если в столбце не было положительных элементов, устанавливаем 0
            if (!hasPositive) {
                productArray[j] = 0;
            }
        }
        return productArray;
    }

    // Метод для вывода матрицы
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    // Метод для вывода массива
    private static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }
}
