package CodeUp.basic100;

import java.util.Scanner;

public class N1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int chk = 1;

        while (true) {
            if(chk == n)
                break;
            a += d;
            chk++;
        }
        System.out.println(a);
    }
}
