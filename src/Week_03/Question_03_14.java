package Week_03;

import java.util.Scanner;
import java.util.Scanner;
public class Question_03_14 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the flip of coin(0 represents head 1 represent tail)");
        int guess = input.nextInt();
        int num = (int) (Math.random()*2);
        if (guess == num)
            System.out.println("Your guess is correct!");
        else
            System.out.println("Your guess is wrong!");
    }
}
