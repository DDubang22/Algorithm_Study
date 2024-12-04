package Baekjoon;

// 그리디 알고리즘
import java.util.*;

public class 보물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];
        int result = 0;

        for (int i = 0; i < A.length; i++) A[i] = sc.nextInt();
        for (int i = 0; i < B.length; i++) B[i] = sc.nextInt();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < num; i++) result += A[i] * B[num - i - 1];

        System.out.println(result);
    }
}

/**
 * 0 1 2 3 4
 * 4 3 2 1 0
 */
