package Week_02;

import java.util.Scanner;

public class Question_02_12 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed an acceleration:");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        System.out.println("The minimum runway length for this plane is "+((int)(1000*(speed*speed)/(2*acceleration)))/1000.0);
    }
}
