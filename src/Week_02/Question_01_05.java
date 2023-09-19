package Week_02;

import java.util.Scanner;

public class Question_01_05 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subtotal and gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double gratuity =(subtotal*gratuity_rate/100);
        double total = subtotal+gratuity;
        System.out.println("The gratuity is " + gratuity + " and the total is "+ total);
    }
}
