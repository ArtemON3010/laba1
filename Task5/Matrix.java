package Task5;

import java.util.Scanner;


public class Matrix {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final int[][] matrix;

    public Matrix(final int rows, final int columns) {
        this.numberOfRows = rows;
        this.numberOfColumns= columns;
        matrix = new int[rows][columns];
    }

    public Matrix(final int rows, final int columns, final int[][] array) {
        this.numberOfRows = rows;
        this.numberOfColumns = columns;
        this.matrix = array;
    }


    public Matrix() {
        final Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter the number of rows: ");
        numberOfRows = keyboard.nextInt();
        System.out.print("Please enter the number of columns: ");
        numberOfColumns = keyboard.nextInt();
        matrix = new int[numberOfRows][numberOfColumns];
        System.out.println("Please assign the following elements: ");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public Matrix Transposition() {
        final Matrix tMatrix = new Matrix(this.numberOfColumns, this.numberOfRows);

        for (int i = 0; i < tMatrix.numberOfRows; i++) {
            for (int j = 0; j < tMatrix.numberOfColumns; j++) {
                tMatrix.matrix[i][j] = this.matrix[j][i];
            }
        }
        return tMatrix;
    }

    public void Print() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
