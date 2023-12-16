package Week_08;

import java.util.Scanner;

public class Question_08_01 {
    public static void main (String[]args){
        double [][] matrix=arrayCreater();
        for (int i=0;i< matrix.length;i++){
            sumCollumn( matrix ,i);
        }

    }
    public static  double[][] arrayCreater (){
    Scanner input = new Scanner(System.in);
        double [][] matrix = new double[3][4];
        System.out.println("Enter a matrix:");
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
      return matrix;
    }
    public static void sumCollumn(double [][]matrix,int number){
        double sum=0;
        for(int i = 0; i<matrix[number].length;i++){
            sum+=matrix[number][i];
        }
        System.out.println("Sum of the elements in column "+number+" is "+sum);

    }

}
