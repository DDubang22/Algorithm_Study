package Baekjoon;

import java.util.*;

public class 스택수열 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int n = sc.nextInt();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if(input > max) {
                for(int j = max + 1; j <= input; j++) {
                    stack.push(j);
                    list.add("+");
                }
                stack.pop();
                list.add("-");
                max = input;
            }
            else {
                if (stack.peek() != input) {
                    list.clear();
                    list.add("NO");
                    break;
                }
                stack.pop();
                list.add("-");
            }
//            System.out.println(stack);
//            System.out.println(list);
//            System.out.println(max);
        }

        for(String s : list) {
            System.out.println(s);
        }
        
    }
}


