package CodeUp.basic100;

import java.util.ArrayList;
import java.util.Scanner;

public class N1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        for (Integer i : list)
            if (i % 2 == 0)
                System.out.println(i);
    }
}
