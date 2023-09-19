package Week_03;

import java.util.Scanner;

public class Question_03_17 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Scissors (0), Rock(1), Paper(2) :");
        int user = input.nextInt();
        int pc = (int)(Math.random()*4-1);
        switch (pc){
            case 0:{
                System.out.print("The computer is scissors.");
                switch (user) {
                    case 0:
                        System.out.print(" You are scissors too. It is a draw.");
                        break;
                    case 1:
                        System.out.println(" You are rock. You won!");
                        break;
                    case 2:
                        System.out.println(" You are Paper. You lose.");
                        break;
                }
                break;
                }
            case 1:
                System.out.println("The computer is Rock.");
                switch (user){
                    case 0:
                        System.out.print(" You are scissors. You lose.");
                        break;
                    case 1:
                        System.out.println(" You are rock. It is a draw.");
                        break;
                    case 2:
                        System.out.println(" You are Paper. You won!");
                        break;


                }
                break;
            case 2:
                System.out.println("The computer is Paper.");
                switch (user){
                    case 0:
                        System.out.print(" You are scissors. You won!");
                        break;
                    case 1:
                        System.out.println(" You are rock. You lose.");
                        break;
                    case 2:
                        System.out.println(" You are Paper. It is a draw.");
                        break;
                }
                break;

        }
    }
}
