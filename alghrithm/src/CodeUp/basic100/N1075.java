package CodeUp.basic100;

import java.util.Scanner;

public class N1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num-1; i >= 0; --i)
            System.out.println(i);
    }
}
