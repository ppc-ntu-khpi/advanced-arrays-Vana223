/**
 * Тестовий клас для перевірки роботи класу Main.
 */
public class Test {

    /**
     * Метод main для тестування методів класу Main.
     */
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Оригінальна матриця:");
        printMatrix(matrix);
        
        Main.swapRows(matrix, 0, 1);
        System.out.println("\nМатриця після зміни рядків 0 та 1:");
        printMatrix(matrix);
    }
    
     /**
     * Допоміжний метод для виводу матриці на екран.
     *
     * @param matrix матриця, яку треба вивести
     */
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}