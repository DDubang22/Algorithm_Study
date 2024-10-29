package CodeUp.basic100;

import java.util.Scanner;

public class N1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int sum = 0;
        int i = 0;

        while (true) {
            i++;
            sum +=i;
            if (sum >= target) {
                break;
            }
        }
        System.out.println(i);
    }
}
