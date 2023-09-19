package Week_02;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the annual interest rate in percentage:");
        double interestRateInPercentage = input.nextDouble();
        System.out.println("Enter the number of years:");
        double numberOfYears = input.nextDouble();
        double futureInvestmentValue = investmentAmount * Math.pow(  1 + (interestRateInPercentage/100) , numberOfYears*12 );
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
