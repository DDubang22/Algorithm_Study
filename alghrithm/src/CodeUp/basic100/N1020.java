package CodeUp.basic100;

import java.util.Scanner;

public class N1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] result = input.split("-");

        System.out.println(result[0] + result[1]);

    }
}
