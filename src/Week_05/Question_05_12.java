package Week_05;


public class Question_05_12 {
    public static void main(String[] args) {

        int smallestNumber=0;
        while (smallestNumber*smallestNumber<12000){
            smallestNumber--;
        }
        System.out.println("The smallest n is " + smallestNumber);
    }
}