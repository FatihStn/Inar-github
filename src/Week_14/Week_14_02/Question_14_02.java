package Week_14.Week_14_02;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class Question_14_02 {
     public static void main(String []args){
         ArrayList<Integer> list =new ArrayList<>();
         generateList(list);
         System.out.println("Generated ArrayList:\n"+list);

         Set <Integer> setList = new HashSet<>();
         for (int i=0;i< list.size();i++){
             setList.add(list.get(i));
         }
         System.out.println("ArrayList after removing duplicates:\n"+setList);

     }

    public static void removeDuplicate(ArrayList<Integer> list) {



     }

    public static void printList(ArrayList list) {

    }

    public static void generateList(ArrayList list) {
         for (int i=0;i<50;i++){
             list.add((int) (Math.random()*100));
         }

    }




}
