package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int command = sc.nextInt();

        for (int i = 0; i <= command; i++) {
            String input = sc.nextLine();
            if (input.contains("push")) {
                String[] split = input.split(" ");
                int num = Integer.parseInt(split[1]);
                stack.push(num);
            }
            if (input.contains("pop")) {
                if (stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            }

            if (input.contains("size"))
                System.out.println(stack.size());

            if (input.contains("empty"))
                System.out.println(stack.empty() ? 1 : 0);

            if (input.contains("top")) {
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }
    }
}
