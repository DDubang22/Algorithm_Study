package Baekjoon;

import java.util.*;

public class 균형잡힌세상 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals(".")) break;

            String result = isBalanced(input);
            System.out.println(result);
        }
    }

    private static String isBalanced(String input) {
        Stack<String> stack = new Stack<>();

        String[] split = input.split("");
        for (String s : split) {
            if (s.equals("(") || s.equals("["))
                stack.push(s);

            else if (s.equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("("))
                    return "no";
                stack.pop();
            }
            else if (s.equals("]")) {
                if (stack.isEmpty() || !stack.peek().equals("["))
                    return "no";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }
}
