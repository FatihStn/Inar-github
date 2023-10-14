package Week_07;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of student:");
        int max =0;
        int numOfStudents = input.nextInt();

        int students[]=new int[numOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter score:");

            students[i] = input.nextInt();
        }
        for (int i = 0; i < students.length; i++){
            if (students[i]>max)
                max=students[i];
        }
        for (int i = 0; i < students.length; i++){
            System.out.print("Student "+i+" score is "+students[i]+" and grade is ");
            if (students[i]>=max-10)
                System.out.println("A");
            else if ((students[i]<max-10)&(students[i]>=max-20))
                System.out.println("B");
            else if ((students[i]<max-20)&(students[i]>=max-30))
                System.out.println("C");
            else if ((students[i]<max-30)&(students[i]>=max-40))
                System.out.println("D");
            else
                System.out.println("F");
        }






    }



    }


