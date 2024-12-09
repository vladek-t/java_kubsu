package task_2;

/**
 * Четвёртый раздел, 12 вариант
 */

import java.util.Random;

public class IV_actions_on_matrices {
    public static void main(String[] args) {
        // Определяем размер матрицы
        int n = 5; // Вы можете изменить размер матрицы
        int[][] matrix = new int[n][n];

        // Заполняем матрицу случайными значениями от -10 до 10
        fillMatrixWithRandomValues(matrix);

        // Выводим матрицу
        System.out.println("Сгенерированная матрица:");
        printMatrix(matrix);

        // Находим максимальный элемент среди отрицательных элементов над побочной диагональю
        Integer maxNegative = findMaxNegativeAboveSecondaryDiagonal(matrix);

        // Выводим результат
        if (maxNegative != null) {
            System.out.println("Максимальный отрицательный элемент над побочной диагональю: " + maxNegative);
        } else {
            System.out.println("Нет отрицательных элементов над побочной диагональю.");
        }
    }

    // Метод для заполнения матрицы случайными значениями
    private static void fillMatrixWithRandomValues(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // Генерация числа от -10 до 10
            }
        }
    }

    // Метод для нахождения максимального отрицательного элемента над побочной диагональю
    private static Integer findMaxNegativeAboveSecondaryDiagonal(int[][] matrix) {
        Integer maxNegative = null;

        // Проходим по элементам, находящимся над побочной диагональю
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1 - i; j < matrix.length; j++) {
                if (matrix[i][j] < 0) { // Проверяем, является ли элемент отрицательным
                    if (maxNegative == null || matrix[i][j] > maxNegative) {
                        maxNegative = matrix[i][j]; // Обновляем максимальный отрицательный элемент
                    }
                }
            }
        }
        return maxNegative;
    }

    // Метод для вывода матрицы
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}
