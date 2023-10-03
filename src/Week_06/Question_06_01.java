package Week_06;

public class Question_06_01 {
    public static void main (String[]args){

        for (int n=1;n<=100;n++){
            if (n%10==0){
                System.out.println(getPentagonalNumber(n));
            }
            else
                System.out.print(getPentagonalNumber(n)+"  ");

        }

    }
    public static int getPentagonalNumber(int n){
        int pentagonal = (n*(3*n-1))/2;
        return pentagonal;

    }
}
