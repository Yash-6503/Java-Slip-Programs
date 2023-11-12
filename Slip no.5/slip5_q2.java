import java.util.Scanner;

public class slip5_q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Multiplication");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrixAddition();
                    break;
                case 2:
                    matrixMultiplication();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    // Function to perform matrix addition
    private static void matrixAddition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix Addition:");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(matrix1);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(matrix2);

        int[][] resultMatrix = new int[rows][columns];

        // Perform addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant Matrix after Addition:");
        displayMatrix(resultMatrix);
    }

    // Function to perform matrix multiplication
    private static void matrixMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix Multiplication:");
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[columns1][columns2];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(matrix1);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(matrix2);

        int[][] resultMatrix = new int[rows1][columns2];

        // Perform multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix after Multiplication:");
        displayMatrix(resultMatrix);
    }

    // Function to fill a matrix with user input
    private static void fillMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
