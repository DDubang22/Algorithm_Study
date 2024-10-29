package CodeUp.basic100;

import java.util.Scanner;

public class N1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.next().charAt(0);

        for (int i = 97; i <= c; i++)
            System.out.println((char) i);
    }
}
