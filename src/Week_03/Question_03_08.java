package Week_03;

import java.util.Scanner;

public class Question_03_08 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int first;
        int second;
        int third;
        int temp;
        if ((a>b)&&(a>c)){
            first=a;
            second = b;
            third =c;

        }
        else if ((b>a)&&(b>c)){
            first = b;
            second = a;
            third = c;

        }
        else {
            first = c ;
            second = a;
            third = b;
        }
        if (third>second){
            temp = second;
            second = third;
            third = temp;
        }
        System.out.println(third + " < " + second + " < " + first);


    }
}
