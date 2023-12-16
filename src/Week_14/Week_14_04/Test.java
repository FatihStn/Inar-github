package Week_14.Week_14_04;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();

        System.out.println("Enter the size 'n for ArrayList A: ");
        int n = input.nextInt();
        System.out.println("Enter " + n + " integer for ArrayList A: ");
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            A.add(number);
        }

        System.out.println("Enter the size 'n for ArrayList B: ");
        int m = input.nextInt();
        System.out.println("Enter " + m + " integer for ArrayList B: ");
        for (int i = 0; i < m; i++) {
            int number = input.nextInt();
            B.add(number);
        }
        sortArrayList(A,B,C);
        System.out.println("Merged and sorted ArrayList C: "+C);


    }

    private static void sortArrayList(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        Collections.sort(a);
        Collections.sort(b,Collections.reverseOrder());
        c.addAll(a);
        c.addAll(b);








    }


}


