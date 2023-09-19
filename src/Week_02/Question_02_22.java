package Week_02;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount as integer , for example 1156 for 11,56");
        int amount = input.nextInt();
        System.out.println("Your amount "+ amount +" consists of ");
        System.out.println(amount/100 + " dollars");
        System.out.println((amount%100)/25 + " quarters");
        System.out.println(((amount%100)%25)/10 + " dimes");
        System.out.println((((amount%100)%25)%10)/5 + " nickels");
        System.out.println(((((amount%100)%25)%10)/5) + " pennies");
    }
}
