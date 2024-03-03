/*
 * Create a matrix class representing the inverse, determinant, transpose of a matrix with the test class also.
 */



package Task_3;

import java.util.Scanner;
public class MatrixTest 
{
    public static void main(String[] args) 
    {
        Matrix myMatrix = null;
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("YOU WANT A SQUARE (ENTER 1) MATRIX OR RECTANGULAR (ENTER 2): ");
            choice = input.nextInt();
        } while (choice != 1 && choice != 2);

        int row = 0, col = 0;
        switch (choice) {
            case 1:
                System.out.print("Enter the value of n (rows or cols): ");
                do {
                    row = input.nextInt();
                } while (row < 1);
                col = row;
                myMatrix = new Matrix(row);
                break;
            case 2:
                System.out.print("Enter the value of first rows then cols: ");
                row = input.nextInt();
                col = input.nextInt();
                while (row < 1 || col < 1) {
                    System.out.print("Re-Enter the values: ");
                    row = input.nextInt();
                    col = input.nextInt();
                }
                myMatrix = new Matrix(row, col);
                break;
        }

        double[][] inputMatrix = new double[row][col];
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inputMatrix[i][j] = input.nextDouble();
            }
        }

        processMatrix(myMatrix, inputMatrix, row, col);
    }

    public static void processMatrix(Matrix myMatrix, double[][] inputMatrix, int row, int col) 
    {
        if(row == col)
        {
            System.out.printf("The determinant of this matrix is: %.2f%n", myMatrix.determinant(inputMatrix));
        }
        else
        {
            System.out.print("Determinant not possible.");
        }

        if (myMatrix.determinant(inputMatrix) != 0.0 && row == col) 
        {
            System.out.println("The inverse is: ");
            double[][] inverse = myMatrix.inverse(inputMatrix);
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++) 
                {
                    System.out.printf("%.2f  ", inverse[i][j]);
                }
                System.out.println();
            }
        } 
        else 
        {
            System.out.println("Inverse not possible");
        }
    }
}
