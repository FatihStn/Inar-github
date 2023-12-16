package Week_08;

import java.util.Scanner;

public class Question_08_04 {
    public static void main (String []args){
        int matrix [][] =getArray();
    }
    public static int[][] getArray (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int numOfEmployees=input.nextInt();
        int [][] array = new int[numOfEmployees][7];
        System.out.println("Enter the working hours of employees:");
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=input.nextInt();
            }
        }
        return array;
    }
}
