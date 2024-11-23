package Programemers.lv1;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        long n = 10_000_000_000L;
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();

        while(n !=0) {
            list.add((int) n % 10);
            n /=10;
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
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

//짝수와 홀수
/*class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}*/

//약수의 합
/*class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;

        while(i != n) {
            i++;
            if(n % i == 0)
                answer +=i;
        }

        return answer;
    }
}
// 제곱근을 이용한 방법 시간복잡도가 O(rootN) 걸린다
class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);

        for(int i = 1; i <=sqrt; i++){
            if(n % i == 0) {
                answer +=i;
                if(i != n/i)
                    answer +=n/i;
            }

        }
        return answer;
    }
}
*/

//자릿수 더하기
/*public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /=10;
        }

        return answer;
    }
}
*/

//평균 구하기
/*class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i : arr) {
            answer += i;
        }

        answer /= arr.length;

        return answer;
    }
}*/

//x만큼 간격이 있는 n개의 숫자
/*class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++) {
            answer[i-1] = (long)(i) * x;
        }
        return answer;
}*/


//같은 숫자는 싫어
/*public class Solution {
    public int[] solution(int []arr) {
        int[] answer ={};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length - 1]);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}*/

//문자열을 정수로 바꾸기
/*class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}*/

//문자열 내 p와 y의 개수
/*class Solution {
    boolean solution(String s) {
        String lowercase = s.toLowerCase();
        String s1 = lowercase.replaceAll("[^py]", "");
        int pCount = 0;
        int yCount = 0;

        String[] split = s1.split("");
        for (String str : split) {
            if(str.equals("p")) pCount++;
            else if (str.equals("y")) yCount++;
        }

        return pCount == yCount;
    }
}*/

//자연수 뒤집어 배열로 만들기
/*class Solution {
    public int[] solution(long n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();

        while(n !=0) {
            list.add((int)(n % 10));
            n /=10;
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}*/

