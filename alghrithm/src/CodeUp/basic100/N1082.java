package CodeUp.basic100;

import java.util.Scanner;

public class N1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Integer num = Integer.valueOf(input, 16);

        for (int i = 1; i < 16; i++) {
            System.out.println(input + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(num * i).toUpperCase());
        }
    }
}
