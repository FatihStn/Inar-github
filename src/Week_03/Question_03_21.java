package Week_03;

import java.util.Scanner;

public class Question_03_21 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = input.nextInt();
        System.out.println("Enter month:");
        int month = input.nextInt();
        System.out.println("Enter the day of month:");
        int q = input.nextInt(); //day of month

        int j = (int) (year/100);
        int k = year%100;
        int h = (int)((q+((26*(month+1)/10)+k+(k/4)+(j/4)+(5*j)))%7);
        switch (h){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }
}
