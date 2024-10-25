package CodeUp.basic100;

import java.util.Scanner;

public class N1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] result = sc.next().split(":");
        System.out.printf("%d",Integer.valueOf(result[1]));
    }
}
