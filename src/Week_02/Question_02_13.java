package Week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double amount = input.nextDouble();
        double interest = 0.05/12 ;
        double amount1 = amount*(1+interest);
        double amount2 = (amount+amount1)*(1+interest);
        double amount3 = (amount+amount2)*(1+interest);
        double amount4 = (amount+amount3)*(1+interest);
        double amount5 = (amount+amount4)*(1+interest);
        double amount6 = (amount+amount5)*(1+interest);
        System.out.println("After the six mounth, the account value is: " + ((int)(amount6*100)/100.0));
    }
}
