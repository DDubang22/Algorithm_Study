package Programemers.lv0;

import java.util.*;

public class Basic2 {
    public static void main(String[] args) {
        
    }
}

//특정 문자 제거하기
/*
class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}*/

//직각삼각형 출력하기
/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}*/

//주사위의 개수
/*class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;

        return width * length * height;
    }
}*/

//제곱수 판별하기
/*
class Solution {
    public int solution(int n) {
        int answer = 2;
        for (int i = 1; i*i <= n; i++) {
            if (i * i == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}*/

//배열 자르기
/*
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int index = 0;

        for(int i = num1; i <= num2; i++)
            answer[index++] = numbers[i];

        return answer;
    }
}
*/

//최댓값 만들기(2)
/*import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2])
            return numbers[0] * numbers[1];
        else
            return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}*/

