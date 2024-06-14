import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int matrix1rows;
        int matrix1cols;
        int matrix2cols;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows of  matrix 1: ");
        matrix1rows = scanner.nextInt();
        System.out.println("Enter number of columns of matrix 1: ");
        matrix1cols = scanner.nextInt();

        System.out.printf("Matrix 2 must have %d rows, enter number of columns for matrix 2: ", matrix1cols);
        matrix2cols = scanner.nextInt();

        int[][] matrix1 = new int[matrix1rows][matrix1cols];
        int[][] matrix2 = new int[matrix1cols][matrix2cols];
        int[][] multiple =new  int[matrix1rows][matrix2cols];


        System.out.println("Enter matrix 1: ");
        for (int i =0; i<matrix1rows;i++){
            for(int j=0;j<matrix1cols;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter matrix 2: ");
        for (int i =0; i<matrix1cols;i++){
            for(int j=0;j<matrix2cols;j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }



        for(int i=0; i < matrix1rows; i++){
            for (int j=0; j < matrix2cols; j++){
                for (int k = 0; k < matrix1cols; k++){
                    multiple[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }
        }

        System.out.println("Multiple: ");
        for (int[] row : multiple) {
            System.out.print("| ");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("|");
        }

    }


}
