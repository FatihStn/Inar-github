package Week_06;

import java.util.Scanner;

public class Question_06_02 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        long number = input.nextLong();
        System.out.println("Sum of the digits in "+number+" is "+sumDigits(number));

    }
    public static int sumDigits(long n){

        int sum=0;

        while (n>1){
           sum += (int) n % 10;
           n /= 10;



        }
        return sum;
    }
}
