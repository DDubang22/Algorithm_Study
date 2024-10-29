package CodeUp.basic100;

import java.util.ArrayList;
import java.util.Scanner;

public class N1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();

        while (true) {
            char c = sc.next().charAt(0);
            list.add(c);
            if(c == 'q')
                break;
        }

        for (Character c : list)
            System.out.println(c);
    }
}
