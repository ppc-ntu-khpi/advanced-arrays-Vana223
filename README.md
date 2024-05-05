# Практична робота "Поглиблене використання масивів"

## Завдання 14
### У матриці розміром N x M поміняти місцями два вказвні рядки.
```` java
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
````

```` java

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
````

### Результат:
![](/screen/Screenshot_1.png)