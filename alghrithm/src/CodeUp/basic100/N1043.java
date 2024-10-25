package CodeUp.basic100;

import java.util.Scanner;

public class N1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int rest = a % b;
        System.out.println(rest);
    }
}
