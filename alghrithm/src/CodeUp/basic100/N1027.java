package CodeUp.basic100;

import java.util.Scanner;

public class N1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = sc.next().split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.valueOf(result[2]), Integer.valueOf(result[1]), Integer.valueOf(result[0]));
    }
}
