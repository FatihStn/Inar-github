package Week_02;

import java.util.Scanner;

public class Question_02_10 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of water in kilograms");
        double amountOfWater = input.nextDouble();
        System.out.println("Entel the initial temperature");
        double initial_temperature = input.nextDouble();
        System.out.println("Enter final temperature");
        double final_temperature = input.nextDouble();
        System.out.println("The energy needed is " + (amountOfWater*(final_temperature-initial_temperature)*4184));
    }
    }

