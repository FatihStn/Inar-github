package Week_13.Week_13_18;

import Week_13.Week_13_14.Rational;
import Week_13.Week_13_15.RationalForBigNumbers;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {
        RationalForBigNumbers sum = new RationalForBigNumbers(BigInteger.ZERO, new BigInteger("1"));

        for (int i = 1; i < 100; i++) {
            RationalForBigNumbers number = new RationalForBigNumbers(new BigInteger("" + i),
                    new BigInteger("" + (1 + i)));
            sum = sum.add(number);
        }
        System.out.println("The result is --> " + sum);
    }
}