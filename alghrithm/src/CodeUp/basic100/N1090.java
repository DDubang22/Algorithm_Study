package CodeUp.basic100;

import java.util.Scanner;

public class N1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int chk = 1;

        while (true) {
            if(chk == n)
                break;
            a *=r;
            chk++;
        }
        System.out.println(a);
    }
}
