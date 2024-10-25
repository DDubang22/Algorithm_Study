package CodeUp.basic100;

import java.util.Scanner;

public class N1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int decimal = Integer.parseInt(input, 16);

        String octalString = Integer.toOctalString(decimal);
        System.out.println(octalString);
    }
}
