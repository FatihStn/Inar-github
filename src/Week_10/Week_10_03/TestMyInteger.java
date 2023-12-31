package Week_10.Week_10_03;

import Week_10.Week_10_03.MyInteger;

public class TestMyInteger {


        public static void main(String[] args) {
            MyInteger myInteger = new MyInteger(41614161);
            System.out.println("isEven(): " + myInteger.isEven());
            System.out.println("isOdd(): " + myInteger.isOdd());
            System.out.println("isPrime(): " + myInteger.isPrime());
            System.out.println("equals(10): " + myInteger.equals(10));
            System.out.println("equals(MyInteger(41614161): " + myInteger.isEqual(41614161));
            System.out.println("isEven(41614161) static: " + MyInteger.isEven(41614161));
            System.out.println("isOdd(41614161) static: " + MyInteger.isOdd(41614161));
            System.out.println("isPrime(41614161) static: " + MyInteger.isPrime(41614161));
            System.out.print("parseInt(char[] {1,2,3}) static: ");
            char[] ch = {'1', '2', '3'};
            int[] array = MyInteger.parsInt(ch);
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i]);
            }
            System.out.println("\nparInt(String 123) static: " + MyInteger.parsInt("123"));
        }
    }


