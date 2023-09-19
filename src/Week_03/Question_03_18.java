package Week_03;

import java.util.Scanner;

public class Question_03_18 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of your package(in pound):");
        int weight = input.nextInt();
        if ((weight>0)&&(weight<=1)){
            System.out.println("Shipping cost of package is 3,5$");

        } else if ((weight>1)&&(weight<=3)) {
            System.out.println("Shipping cost of package is 5,5$");
            
        } else if ((weight>3)&&(weight<=10)) {
            System.out.println("Shipping cost of package is 8,5$");

        } else if ((weight>3)&&(weight<=10)) {
            System.out.println("Shipping cost of package is 10,5$");

        }
        else
            System.out.println("The package cannot be shipped");
    }
}
