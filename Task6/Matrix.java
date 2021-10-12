package Task6;

import java.util.Scanner;

public class Matrix {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final int[][] matrix;

    private int getRows(){return numberOfRows;}
    private int getColumns(){return numberOfColumns;}
    private double getElement(final int numberOfRows, final int numberOfColumns){return matrix[numberOfRows][numberOfColumns];}

    private void assignElement(final int value, final int i,final int j){matrix[i][j] = value;}

    public Matrix(final int rows, final int columns) {
        this.numberOfRows = rows;
        this.numberOfColumns = columns;
        matrix = new int[rows][columns];
    }

    public Matrix(final int rows, final int columns, final int[][] matrix) {
        this.numberOfRows = rows;
        this.numberOfColumns = columns;
        this.matrix = matrix;
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

    public Matrix multiplying(final Matrix matrix) {
        if (this.numberOfColumns != matrix.numberOfRows) throw new IndexOutOfBoundsException("Wrong matrix dimensions");

        final Matrix result = new Matrix(this.numberOfRows, matrix.numberOfColumns);

        for (int i = 0; i < this.numberOfRows; i++) //Цикл рядків
            for (int j = 0; j < matrix.numberOfColumns; j++) //Цикл стовпчиків
                for (int k = 0; k < matrix.numberOfRows; k++) //Цикл для обчислення добутку
                    result.matrix[i][j] += (this.matrix[i][k] * matrix.matrix[k][j]);
        return result;
    }


    public void PrintM() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
