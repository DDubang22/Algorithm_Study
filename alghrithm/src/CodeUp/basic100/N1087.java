package CodeUp.basic100;

import java.util.Scanner;

public class N1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 0, sum = 0;
        while (true) {
            i++;
            if (sum >= num)
                break;
            sum +=i;
        }
        System.out.println(sum);
    }
}

