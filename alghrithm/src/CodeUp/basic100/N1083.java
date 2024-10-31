package CodeUp.basic100;

import java.util.Scanner;

public class N1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            if (i % 3 == 0)
                System.out.print("X ");
            else
                System.out.print(i + " ");
        }
    }
}
