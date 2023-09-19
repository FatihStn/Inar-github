package Week_03;

import java.util.Scanner;

public class Question_03_06 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weightInPound = input.nextDouble();
        System.out.println("Enter feet:");
        double heightInFeet = input.nextDouble();
        System.out.println("Enter inches:");
        double heightInInches = input.nextDouble();
        double weightInKilogram = weightInPound*0.45359237;
        double heightInMeters = (heightInFeet*0.3048)+(heightInInches*0.0254);
        double bmi = weightInKilogram/(heightInMeters*heightInMeters);
        System.out.println("BMI is "+ bmi);
        if (bmi<18.5)
            System.out.println("Underweight");
        else if ((bmi>=18.5)&&(bmi<25))
            System.out.println("Normal");
        else if ((bmi>=25)&&(bmi<30))
            System.out.println("Overweight");
        else
            System.out.println("Obese");



    }


    }

