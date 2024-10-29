package CodeUp.basic100;

import java.util.ArrayList;
import java.util.Scanner;

public class N1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int i =0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < count) {
            list.add(sc.nextInt());
            i++;
        }

        for (Integer integer : list)
            System.out.println(integer);
    }
}
