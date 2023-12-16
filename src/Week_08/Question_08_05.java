package Week_08;

import java.util.Scanner;

public class Question_08_05 {
    public static void main (String[]args){
        double [][] matrix1=getArray();
        double [][] matrix2=getArray();
        double [][] matrixSum= sumMatrix(matrix1,matrix2);
        displayArray(matrix1,matrix2, matrixSum);
    }
    public static double [][] getArray(){
        Scanner input = new Scanner(System.in);
        double [][]matrix=new double[3][3];
        System.out.println("Enter the matrix:");
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        return matrix;
    }
    public static double [][] sumMatrix(double [][] matrix1,double [][] matrix2){
        double [][] sum=new double[matrix1.length][matrix1[0].length];
        for (int i=0;i< matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return sum;
    }
    public static void displayArray(double [][] array1,double [][] array2,double [][] array3){
        System.out.println("The matrices added like;");
        for (int i=0;i< array1.length;i++){
            for (int j=0;j<array1[i].length;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.print("+ ");
            for (int j=0;j<array1[i].length;j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.print("= ");
            for (int j=0;j<array1[i].length;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
