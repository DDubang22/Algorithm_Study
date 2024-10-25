package CodeUp.basic100;

import java.util.Scanner;

public class N1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.println("'" + input.charAt(i) + "'");
        }
    }
}
