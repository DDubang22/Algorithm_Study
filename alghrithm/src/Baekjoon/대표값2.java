package Baekjoon;

import java.util.*;

public class 대표값2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int midValue = 0, avg = 0, sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum +=array[i];
        }

        Arrays.sort(array);

        midValue = array[array.length / 2];
        avg = sum / 5;

        System.out.println(avg + " " + midValue);
    }
}
