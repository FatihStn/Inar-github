package Week_08;

import java.util.Scanner;

public class Question_08_06 {
    public static void main (String[]args){
        double [][] matrix1=getArray();
        double [][] matrix2=getArray();
        double [][] matrix3=multArrays(matrix1,matrix2);
        displayArray(matrix1,matrix2,matrix3);
    }
    public static double [][] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of matrix:");
        int row = input.nextInt();
        int column = input.nextInt();
        double [][] matrix = new double[row][column];
        System.out.println("Enter a matrix:");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        return matrix;
    }
    public static double [][] multArrays(double [][] matrix1,double[][]matrix2){
        double [][] multMatrix= new double[matrix1.length][matrix1[0].length];
        for (int i=0;i< matrix1.length;i++){
            for (int j=0;j< matrix1[i].length;j++){
                for (int k=0;k<matrix1.length;k++){
                    multMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return multMatrix;
    }
    public static void displayArray (double[][] array1,double[][]array2,double[][] array3){
        for (int i=0;i< array3.length;i++){
            for (int j=0;j<array1[0].length;j++){
                System.out.print(array1[i][j]+" ");
            }
            if (i ==1)
                System.out.print(" * ");
            else
                System.out.print("   ");
            for (int j=0;j<array2[0].length;j++){
                System.out.print(array2[i][j]+" ");

            }
            if (i==1)
                System.out.print(" = ");
            else
                System.out.print("   ");
            for (int j=0;j<array3[i].length;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
