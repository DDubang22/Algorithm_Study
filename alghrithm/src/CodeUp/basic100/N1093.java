package CodeUp.basic100;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 24; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            Integer findValue = map.get(input);
            map.put(input,++findValue);
        }
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }
}
