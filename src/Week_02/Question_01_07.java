package Week_02;

import java.util.Scanner;

public class Question_01_07 {
    public static void main (String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();
        int days = (minutes/60/24);
        int years = days/365;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days%365+" days");
    }
}
