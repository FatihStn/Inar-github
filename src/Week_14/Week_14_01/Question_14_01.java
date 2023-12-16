package Week_14.Week_14_01;
import java.util.ArrayList;
import java.util.Collections;

public class Question_14_01 {
    public static void main (String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add((int)(Math.random()*100));
        }
        System.out.println("Generated array is "+list);
        Collections.reverse(list);
        System.out.println("Reversed array is "+list);
    }
}
