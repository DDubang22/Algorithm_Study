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


//약수 구하기
/*class Solution {
    public int[] solution(int n) {
        int sqrt = (int)Math.sqrt(n);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        while (sqrt != 0) {
            if(n % sqrt == 0) list.add(sqrt);
            sqrt--;
        }

        for (Integer integer : list)
            list2.add(n / integer);

        set.addAll(list);
        set.addAll(list2);

        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        int[] array = result.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }

==== 다른 정답 풀이
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i<= n; i++) {
            if(n % i == 0)
                list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

ps.

내가 너무 어렵게 푼거 같다
약수 구하는 것에 대한 개념이 뭔가 부족한거 같다..

}*/

//합성수 구하기
/*class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count >= 3) answer++;
            count = 0;
        }

        return answer;
    }
}*/
