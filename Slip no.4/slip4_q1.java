import java.io.*;
import java.util.*;

public class slip4_q1 {
    public static void main(String[] args) {
        int[][] originalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows = originalArray.length;
        int columns = originalArray[0].length;

        int[][] transformedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transformedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Transformed Array:");
        printArray(transformedArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}