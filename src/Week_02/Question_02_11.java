package Week_02;

import java.util.Scanner;

public class Question_02_11 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of year:");
        int number = input.nextInt();
        double total_seconds= 365*24*60*60;
        int population= 312032486;
        int total_increase=(int)((total_seconds/7)-(total_seconds/13)+(total_seconds/45));
        System.out.println("The population in "+number+" years is "+ (population+(number*(total_increase))));
    }
}
