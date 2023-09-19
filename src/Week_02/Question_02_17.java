package Week_02;

import java.util.Scanner;

public class Question_02_17 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit between -58F and 41F :");
        double ta = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        double v = input.nextDouble();
        double t= 35.74 +(0.6215*ta) - (35.75*Math.pow(v,0.16)) + (0.4275*ta*Math.pow(v,0.16));
        System.out.println("The wind chill index is :" + (int)(t*10000)/10000.0);
    }
}
