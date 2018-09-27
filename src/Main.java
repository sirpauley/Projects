
/** *
* NUMBERS
* **/

 import java.math.*;
 import java.io.*;
 import java.util.Scanner;

/* *
* Find PI to the Nth Digit
* Enter a number and have the program generate PI up to that many decimal places.
* Keep a limit to how far the program will go.
* */

class NthOfPi{

    public void piDigit() {
//        double count = 999999999;
//        double pi = 0.0d;
//        double denominator = 1;
//
//        for (int x = 0; x < count; x++) {
//
//            if (x % 2 == 0) {
//                pi = pi + (1 / denominator);
//            } else {
//                pi = pi - (1 / denominator);
//            }
//            denominator = denominator + 2;
//
//            //System.out.println("Pi: " + pi*4);
//        }
//
//        pi = pi * 4;
//        System.out.println(pi);


        BigDecimal seven = new BigDecimal(7.0);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the decimal places to which you'd like PI printed: ");
        int i = input.nextInt();

        if (i > 100 || i < 0) {
            System.out.println("Decimal place out of bounds!");
        } else {
            BigDecimal pi = new BigDecimal(22.0).divide(seven, i, BigDecimal.ROUND_UP);
            System.out.println(pi);
        }


    }
}





public class Main {

    public static void main(String[] args) {
        NthOfPi testNthPi = new NthOfPi();
        testNthPi.piDigit();



    }
}
