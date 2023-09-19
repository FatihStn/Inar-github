package Week_02;

import java.util.Scanner;

public class Question_01_03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and the lenght of the cilinder:");
        double radius = input.nextDouble();
        double lenght = input.nextDouble();
        double pi = 3.14;
        double area = radius*radius*pi ;
        System.out.println("The area is " + area);
        System.out.println("The volume is "+ area*lenght );

    }
}
