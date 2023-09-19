package Week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight_pound = input.nextDouble();
        System.out.println("Enter height in inches:");
        double height_inch = input.nextDouble();
        double pound_to_kilogram =  0.4535923 ;
        double inch_to_meter= 0.0254;
        double bmi= (weight_pound*pound_to_kilogram)/((height_inch*inch_to_meter)*(height_inch*inch_to_meter));
        System.out.println("BMI is "+ ((int)(bmi*100))/100.0);
    }
}
