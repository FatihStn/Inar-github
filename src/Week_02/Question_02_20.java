package Week_02;

import java.util.Scanner;

public class Question_02_20 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for %3):");
        double balance = input.nextDouble();
        double interest_rate = input.nextDouble();
        System.out.println("The interest is "+ (balance*(interest_rate/1200)));
    }
}
