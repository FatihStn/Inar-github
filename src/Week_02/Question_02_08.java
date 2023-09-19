package Week_02;

import java.util.Scanner;

public class Question_02_08 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Gmt");
        int gmt = input.nextInt();
        long millisec = System.currentTimeMillis();
        int sec = (int) ((millisec/1000)%60);
        int min = (int) ((millisec/1000/60)%60);
        int hour = (int) ((millisec/1000/60/60)%24);
        System.out.println("Current time is: " + ((hour+gmt)%24)+ " : " + (min) + " : " + sec);
    }
}
