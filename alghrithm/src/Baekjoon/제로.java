package Baekjoon;

import java.util.*;

public class 제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int num = sc.nextInt();

            if(num == 0 && !stack.isEmpty()) stack.pop();
            else stack.push(num);
        }

        for (Integer value : stack) {
            sum += value;
        }
        System.out.println(sum);
    }
}
