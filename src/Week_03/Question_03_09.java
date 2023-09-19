package Week_03;

import java.util.Scanner;

public class Question_03_09 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digit of your ISBN number as integer:");
        int isbn = input.nextInt();
        int d1 = isbn%10;
        int d2 = (isbn%100)/10;
        int d3 = (isbn%1000)/100;
        int d4 = (isbn%10000)/1000;
        int d5 = (isbn%100000)/10000;
        int d6 = (isbn%1000000)/100000;
        int d7 = (isbn%10000000)/1000000;
        int d8 = (isbn%100000000)/10000000;
        int d9 = (isbn%1000000000)/100000000;
        int isbn10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;

        if (isbn10 == 10)
            System.out.println("The ISBN-10 number is "+isbn+"X");
        else
            System.out.println("The ISBN-10 number is "+isbn+""+isbn10);
    }
}
