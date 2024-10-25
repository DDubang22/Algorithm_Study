package CodeUp.basic100;

import java.util.Scanner;

public class N1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int num1 = input / 10000;
        int num2 = (input - (num1 * 10000)) / 1000;
        int num3 = ((input - num1 * 10000) - (num2 * 1000)) / 100;
        int num4 = ((input - num1 * 10000) - (num2 * 1000) - (num3 * 100)) / 10;
        int num5 = ((input - num1 * 10000) - (num2 * 1000) - (num3 * 100) - (num4 * 10));
        System.out.println("[" + num1 * 10000 + "]");
        System.out.println("[" + num2 * 1000 + "]");
        System.out.println("[" + num3 * 100 + "]");
        System.out.println("[" + num4 * 10 + "]");
        System.out.println("[" + num5 + "]");
    }
}
