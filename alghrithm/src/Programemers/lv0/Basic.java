package Programemers.lv0;


import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int n = 1234;
        String s = String.valueOf(n);
        String[] result = s.split("");
        int total = 0;
        for (String s1 : result) {
            int i = Integer.parseInt(s1);
        }



    }
}

// 부분 문자열인지 확인하기
/*
class Solution {
    public int solution(String my_string, String target) {
        boolean result = my_string.contains(target);
        return result ? 1 : 0;
    }
}*/

// 몫 구하기
/*class Solution {
    public int solution(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}*/

// 나머지 구하기
/*class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}*/

// 두 수의 차
/*class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}*/

// 숫자 비교하기
/*class Solution {
    public int solution(int num1, int num2) {
        boolean answer = num1 == num2;
        return answer ? 1 : -1 ;
    }
}*/

//나이 출력
/*class Solution {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}*/

//두 수의 곱
/*
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}*/

//두 수의 나눗셈
/*class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1 / num2;
        int answer = (int) (result * 1000);
        return answer;
    }
}*/

//각도기
/*class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90)
            answer = 1;
        if(angle == 90)
            answer = 2;
        if(angle > 90 && angle < 180)
            answer = 3;
        if(angle == 180)
            answer = 4;
        return answer;
    }
}*/

//양꼬치
/*class Solution {
    public int solution(int n, int k) {
        int lam = 12000;
        int drink = 2000;
        int total = 12000 * n + drink * k;
        int service = (n / 10) * 2000;
        int answer = total - service;
        return answer;
    }
}*/

//짝수의 합
/*class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =0; i <= n; ++i) {
            if(i % 2 == 0)
                answer +=i;
        }
        return answer;
    }
}*/

//편지
/*
class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}*/

//세균 증식
/*
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 1; i<= t; ++i) {
            answer *= 2;
        }
        return answer;
    }
}*/

//배열의 평균값
/*
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers) {
            answer +=num;
        }
        double result = answer / numbers.length;
        return result;
    }
}*/

//배열 뒤집기
/*class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = num_list.length - 1, j =0; i >=0 ; --i, ++j) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}*/

//짝수 홀수 개수
/*class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0, even = 0;
        for(int i : num_list) {
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}*/

//자릿수 더하기
/*class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        String[] results = str.split("");
        int total = 0;
        for(String s : results) {
            total += Integer.parseInt(s);
        }
        return total;
    }
}*/



