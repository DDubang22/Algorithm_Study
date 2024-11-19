package Programemers.lv1;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
    }
}

//두 정수 사이의 합

/*class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        if(a > b)  {
            temp = a;
            a = b;
            b = temp;

        }
        for(int i = a; i <= b; i++)
            answer +=i;

        return answer;
    }
===== 등차수열 합 공식
class Solution {
    public long solution(int a, int b) {
       return sumAToB(Math.min(a,b), Math.max(a,b));
    }

    private long sumAToB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}

공식 ->  n(a * b) / 2
n = 항 개수
a = 첫째 항
b = 마지막 항


}*/

//분수의 덧셈
/*class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int r = 0;
        int a = Math.max(denom1, denom2);
        int b = Math.min(denom1, denom2);

        a = GCD(a, b);
        int gcd = a;
        int lcm = denom1 * denom2 / gcd;


        if (denom1 != lcm) {
            int num = lcm / denom1;
            denom1 = denom1 * num;
            numer1 = numer1 * num;
        }
        if (denom2 != lcm) {
            int num = lcm / denom2;
            denom2 = denom2 * num;
            numer2 = numer2 * num;
        }

        int numerSum = 0;
        if (denom1 == denom2) {
            numerSum = numer1 + numer2;
        }
        int gcdResult = GCD(numerSum, denom1);

        int lastNumer = numerSum / gcdResult;
        int lastDenom = denom1 / gcdResult;

        return new int[]{lastNumer,lastDenom};

    }

    private static int GCD(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
=== 더 좋은 정답 최대공약수만 이용해서 풀 수 있음
분자 : numerator
분모 : denominator

class Solution {
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        int num = num1 * denom2 + num2 * denom1;
        int denom = denom1 * denom2;

        int gcd = GCD(num, denom);

        return new int[]{num / gcd, denom / gcd};

    }

    private static int GCD(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

*/



