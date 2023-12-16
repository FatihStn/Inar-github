package Week_14.Week_14_06;
import java.util.Random;
import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> arrangedList=new ArrayList<>();
        ArrayList<Integer> originalList=new ArrayList<>();
        Random random = new Random();
        for (int i = 0 ; i<10; i++){
            originalList.add(random.nextInt(100));
        }
        int count=0;
        for (int i=0;i<10;i++){
            if (originalList.get(i)%2==0){
                arrangedList.add(originalList.get(i));
            }
            else {
                arrangedList.add(count,originalList.get(i));
                count++;
            }

        }
        System.out.println("Original list: "+originalList+"\nRearrenged list: "+arrangedList);

    }
}
