package Week_03;

import java.util.Scanner;

public class Question_03_15 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lucky pick(3 digits):");
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();
        int guess3 = input.nextInt();
        int number1 = (int) (Math.random()*11-1);
        int number2 = (int) (Math.random()*11-1);
        int number3 = (int) (Math.random()*11-1);
        System.out.println(number1+""+number2+""+number3);
        if ((guess1==number1)&&(guess2==number2)&&(guess3==number3))
            System.out.println("Total match! You won 10,000$");
        else if (((guess1==number1)&&(guess2==number2))||(((guess1==number1)&&(guess3==number3)))||((guess3==number3)&&(guess2==number2)))
        {
            System.out.println("Two digit match! You won 3,000$");

        } else if ((guess1==number1)||(guess2==number2)||(guess3==number3)) {
            System.out.println("One match! You won 1,000$");

        }
        else
        System.out.println("Sorry no match.");


    }
}
