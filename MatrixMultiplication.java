import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int matrix1rows=0;
        int matrix1cols=0;
        int matrix2cols=0;
        boolean validInput = false;

        Scanner scanner = new Scanner(System.in);

        while(!validInput){
            System.out.println("Enter number of rows of  matrix 1: ");
            if(scanner.hasNextInt()){
                matrix1rows = scanner.nextInt();
                validInput = true;
            }else {
                System.out.println("number of rows must be an integer, re-enter number of rows of matrix 1");
                scanner.next();
            }
        }

        validInput = false; // Reset validInput for next validation

        while(!validInput){
            System.out.println("Enter number of columns of matrix 1: ");
            if(scanner.hasNextInt()){
                matrix1cols = scanner.nextInt();
                validInput = true;
            }else{
                System.out.println("number of columns must be an integer, re-enter number of columns of matrix 1");
                scanner.next();
            }
        }

        validInput = false;

        while(!validInput){
            System.out.printf("Matrix 2 must have %d rows, enter number of columns for matrix 2: ", matrix1cols);
            if(scanner.hasNextInt()){
                matrix2cols = scanner.nextInt();
                validInput=true;
            }else{
                System.out.println("number of columns must be an integer, re-enter number of columns of matrix 1");
                scanner.next();
            }
        }

        int[][] matrix1 = new int[matrix1rows][matrix1cols];
        int[][] matrix2 = new int[matrix1cols][matrix2cols];
        int[][] multiple =new  int[matrix1rows][matrix2cols];

        validInput = false;

        System.out.println("Enter matrix 1: ");
        for (int i =0; i<matrix1rows;i++){
            for(int j=0;j<matrix1cols;j++){
                while(!validInput){
                    if(scanner.hasNextInt()){
                        matrix1[i][j] = scanner.nextInt();
                        validInput=true;
                    }else{
                        System.out.println("All elements of the matrix must be integers, re-enter a valid input");
                        scanner.next();
                    }
                }
                validInput = false;
            }
        }

        System.out.println("Enter matrix 2: ");
        for (int i =0; i<matrix1cols;i++){
            for(int j=0;j<matrix2cols;j++){
                while(!validInput){
                    if(scanner.hasNextInt()){
                        matrix2[i][j] = scanner.nextInt();
                        validInput=true;
                    }else{
                        System.out.println("All elements of the matrix must be integers, re-enter a valid input");
                        scanner.next();
                    }
                }
                validInput = false;
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
