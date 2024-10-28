package CodeUp.basic100;

import java.util.ArrayList;
import java.util.Scanner;

public class N1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = sc.nextInt();
            if(num == 0) break;
            list.add(num);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
