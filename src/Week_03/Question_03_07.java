package Week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount , for example 11,56");
        double amount = input.nextDouble();
        System.out.println("Your amount "+ amount +" consists of ");
        if (((int)(amount))<=1)
            System.out.println(((int)(amount))+" dolar");
        else
            System.out.println(((int)(amount))+" dolars");
        if ((int)(((amount*100)%100)/25)<=1)
            System.out.println((int)(((amount*100)%100)/25)+" quarter");
        else
            System.out.println((int)(((amount*100)%100)/25)+" quarters");
        if (((int)(((amount*100)%100)%25)/10)<=1)
            System.out.println(((int)(((amount*100)%100)%25)/10)+" dime");
        else
            System.out.println(((int)(((amount*100)%100)%25)/10)+" dimes");
        if ((((int)(((amount*100)%100)%25)%10)/5)<=1)
            System.out.println((((int)(((amount*100)%100)%25)%10)/5) + " nickel");
        else
            System.out.println((((int)(((amount*100)%100)%25)%10)/5) + " nickels");
        if ((((int)(((amount*100)%100)%25)%10)%5)<=1)
            System.out.println(((((int)(((amount*100)%100)%25)%10)%5)<=1)+ " penny");
        else
            System.out.println(((((int)(((amount*100)%100)%25)%10)%5))+ " pennies");

    }
}
