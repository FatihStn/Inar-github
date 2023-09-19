package Week_03;

import java.util.Scanner;

public class Question_03_19 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the edges of triangle:");
        double firstEdge = input.nextDouble();
        double secondEdge = input.nextDouble();
        double thirdEdge = input.nextDouble();
        if ((firstEdge+secondEdge<=thirdEdge)||(firstEdge+thirdEdge<=secondEdge)||(secondEdge+thirdEdge<=firstEdge)){
            System.out.println("Invalid input.");
        }
        else
            System.out.println("The perimeter is "+(firstEdge+secondEdge+thirdEdge));
    }
}
