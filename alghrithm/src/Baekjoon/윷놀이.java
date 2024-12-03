package Baekjoon;

import java.util.*;

public class 윷놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        int front = 0;
        int back = 0;



        for (int x = 0; x < 3; x++) {
            for (int i = 0; i < array.length; i++)
                array[i] = sc.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) front++;
                else back++;
            }

            switch (front) {
                case 0 : System.out.println("E");
                case 1 : System.out.println("A");
                case 2 : System.out.println("B");
                case 3 : System.out.println("C");
                case 4 : System.out.println("D");
            }
            front = 0;
            back =0;
        }
    }
}
