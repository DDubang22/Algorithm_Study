package CodeUp.basic100;

import java.util.*;

public class N1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Integer min = Collections.min(list);
        System.out.println(min);
    }
}
