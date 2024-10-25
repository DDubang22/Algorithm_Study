package CodeUp.basic100;

import java.util.Scanner;

public class N1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        //정규식 표현에는 [문자] 또는 역슬래쉬로 시작해야 된다.
        String[] result = input.split("[.]");

        System.out.printf("%04d.%02d.%02d", Integer.valueOf(result[0]), Integer.valueOf(result[1]), Integer.valueOf(result[2]));
    }
}
