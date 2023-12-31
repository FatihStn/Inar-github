package Week_05;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        String answer = input.nextLine();

        //Generate the lottery
        char digitOfLottery1 = (char) ('0' +(int) (Math.random() * 10));
        char digitOfLottery2 = digitOfLottery1;

        while (digitOfLottery1 == digitOfLottery2) {
            digitOfLottery2 = (char) ('0'+(int) (Math.random() * 10));
        }

        //Find the answer's digits
        char digitOfAnswer1 = answer.charAt(0);
        char digitOfAnswer2 = answer.charAt(1);

        //display the lottery number
        System.out.println("The lottery number is " + digitOfLottery1 + digitOfLottery2);

        //Compare the results
        String output;
        if (digitOfAnswer1 == digitOfLottery1 && digitOfAnswer2 == digitOfLottery2) {
            output = "Match all digit exact order: You win $10,000";
        } else if (digitOfAnswer1 == digitOfLottery2 && digitOfAnswer2 == digitOfLottery1) {
            output = "Match all digit but different order: You win $3,000";
        } else if (digitOfAnswer1 == digitOfLottery1 || digitOfAnswer1 == digitOfLottery2 ||
                digitOfAnswer2 == digitOfLottery1 || digitOfAnswer2 == digitOfLottery2) {
            output = "Match one digit: You win $1,000";
        }else {
            output="Sorry, no match";
        }

        System.out.println(output);
    }


}