package Week_09.Week_09_11;

import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        double[] inputs = getInputs();
        LineerEquation linerEquation = new LineerEquation(inputs);
        System.out.println(linerEquation.toString());
    }
    public static double[] getInputs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double[] result = new double[6];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextDouble();
        }
        return result;
    }
}