/**
 * Клас, що містить методи для маніпулювання матрицями.
 */
public class Main {

    /**
     * Метод для обміну двох рядків у матриці.
     *
     * @param matrix матриця, в якій треба обміняти рядки
     * @param row1   індекс першого рядка для обміну
     * @param row2   індекс другого рядка для обміну
     */

    public static void swapRows(int[][] matrix, int row1, int row2) {
        if (matrix == null || matrix.length == 0 || row1 < 0 || row2 < 0 || row1 >= matrix.length || row2 >= matrix.length) {
            System.out.println("Invalid input or matrix dimensions");
            return;
        }
        
        int[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }
}