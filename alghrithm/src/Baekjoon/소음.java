package Baekjoon;

import java.math.BigInteger;
import java.util.*;

public class 소음 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        String operator = sc.nextLine();
        BigInteger num2 = sc.nextBigInteger();

        if (operator.equals("+")) {
            System.out.println(num1.add(num2));
        }
        else {
            System.out.println(num1.multiply(num2));
        }
    }
}
