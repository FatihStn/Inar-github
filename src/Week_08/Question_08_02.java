package Week_08;

import java.util.Scanner;

public class Question_08_02 {
    public static void main (String[]args){
        double[][] matrix=getMatrix();
        double sum=sumOfDiagonal(matrix);
        System.out.println("Sum of elements in multi diagonal is "+sum);
    }
    public static double [][] getMatrix(){
        Scanner input = new Scanner(System.in);
        double [][]matrix = new double [4][4];
        System.out.println("Enter a 4X4 matrix;");
        for (int i=0;i<matrix.length;i++){
            for (int j =0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        return matrix;
    }
    public static double sumOfDiagonal(double matrix[][]){
        double sum=0;
        for (int i=0;i<matrix.length;i++){

                sum+=matrix[i][i];

        }
        return sum;
    }
}
