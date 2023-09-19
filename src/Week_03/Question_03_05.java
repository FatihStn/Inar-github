package Week_03;

import java.util.Scanner;

public class Question_03_05 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today`s day:");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int nextDay = input.nextInt();
        switch (day ){
            case 0 :
                System.out.print("Today is Sunday and the future day is ");
                break;
            case 1 :
                System.out.print("Today is Monday and the future day is ");
                break;
            case 2 :
                System.out.print("Today is Tuesday and the future day is ");
                break;
            case 3 :
                System.out.print("Today is Wednesday and the future day is ");
                break;
            case 4 :
                System.out.print("Today is Thursday and the future day is ");
                break;
            case 5 :
                System.out.print("Today is Friday and the future day is ");
                break;
            case 6 :
                System.out.print("Today is Saturday and the future day is ");
                break;
        }
        switch ((day+nextDay)&7){
            case 0 :
                System.out.print("Sunday");
                break;
            case 1 :
                System.out.print("Monday");
                break;
            case 2 :
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print("Wednesday");
                break;
            case 4 :
                System.out.print("Thursday");
                break;
            case 5 :
                System.out.print("Friday");
                break;
            case 6 :
                System.out.print("Saturday");
                break;
        }
    }
}
