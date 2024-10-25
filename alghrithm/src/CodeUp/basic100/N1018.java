package CodeUp.basic100;

import java.util.Scanner;

public class N1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        String[] result = time.split(":");
        System.out.println(result[0] + ":" + result[1]);
    }
}
