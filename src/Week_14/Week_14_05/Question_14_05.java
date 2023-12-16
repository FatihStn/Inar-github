package Week_14.Week_14_05;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num=0;
        int count=0;
        System.out.println("Enter integers for ArrayList nums(enter -1 to stop):");
        do{

            num = input.nextInt();
            if(num!=-1) {
                if (num == 0) {
                    arrayList.add(num);
                }
                else{
                    arrayList.add(count,num);
                    count++;
                }

            }
        }
        while (num != -1);
        System.out.println(arrayList);


    }

}
