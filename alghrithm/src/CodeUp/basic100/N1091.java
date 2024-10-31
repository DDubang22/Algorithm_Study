package CodeUp.basic100;

import java.util.Scanner;

public class N1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int chk = 1;

        while (true) {
            if (chk == n)
                break;
            a = a * m + d;
            chk++;
        }
        System.out.println(a);
    }
}
