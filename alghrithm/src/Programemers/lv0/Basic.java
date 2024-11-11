package Programemers.lv0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {

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

// 배열 원소의 길이
/*class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; ++i)
            answer[i] = strlist[i].length();
        return answer;
    }
}*/

//중복된 숫자 개수
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {

        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        int answer = 0;
        for(Integer i : list)
            if(i == n) answer++;
        return answer;
    }
}*/

//삼각형의 완성조건(1)
/*class Solution {
    public int solution(int[] sides) {
        int max = 0;
        for (int side : sides) {
            if (side > max)
                max = side;
        }
        int sum  = 0;
        for (int side : sides) {
            sum += side;
        }
        sum -= max;
        return max < sum ? 1 : 2;
    }
}*/

// 머쓱이보다 키 큰 사람
/*import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int result = 0;
        for(int i : array) {
            if(i > height)
                result++;
        }
        return result;
    }
}*/

//배열 두배 만들기
/*class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}*/

//중앙값 구하기
/*import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(array.length - 1) / 2 ];
        return answer;
    }
}*/

//짝수는 싫어요
/*import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i+=2)
            list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}*/

//피자 나눠 먹기(1)
/*class Solution {
    public int solution(int n) {
        int pizza = n / 7;
        if(n % 7 != 0) pizza++;
        return pizza;
    }
}*/

//옷가게 할인 받기
/*class Solution {
    public int solution(int price) {
        return (int) (price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price);
    }
}*/

//아이스 아메리카노
/*import java.util.*;

class Solution {
    public int[] solution(int money) {
        ArrayList<Integer> list = new ArrayList<>();
        int coffee = 5500;
        int share = money / coffee;
        int rest = money % coffee;
        list.add(share);
        list.add(rest);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}*/

//최댓값 만들기
/*import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1] * numbers[numbers.length-2];
        return max;
    }
}*/

//피자 나눠 먹기(3)
/*
class Solution {
    public int solution(int slice, int n) {
        return n % slice != 0 ? n / slice + 1 : n / slice;
    }
}*/

//개미 군단
/*class Solution {
    public int solution(int hp) {
        int result = hp / 5;
        hp = hp % 5;
        result += hp / 3;
        int remainder = hp % 3;
        return result + remainder;
    }
}*/

//가위 바위 보
/*class Solution {
    public String solution(String rsp) {
        String[] result = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(String s : result) {
            if(s.equals("2"))
                sb.append("0");
            if(s.equals("0"))
                sb.append("5");
            if(s.equals("5"))
                sb.append("2");
        }
        return sb.toString();
    }
}*/

//모음 제거
/*class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] result = my_string.split("");
        for(String s : result) {
            if(!(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u"))) {
                sb.append(s);
            }
        }
        return sb.toString();

    }
}*/

//숨어있는 숫자의 덧셈(1)
/*
class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-z]|[A-Z]", "");
        String[] result = str.split("");
        int sum = 0;
        for(String s : result) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}

*/

//대소문자와 소문자
/*class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] ary = my_string.toCharArray();
        for(char c : ary) {
            if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            if(Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}*/

//가장 큰 수 찾기
/*
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> collect = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (Integer i : collect) {
            if (max < i) {
                max = i;
                index = collect.indexOf(i);
            }
        }
        int[] answer = {max, index};
        return answer;
    }
}*/

//n의 배수 고르기
/*import java.util.*;
  import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : numlist) {
            if(i % n == 0) list.add(i);
        }
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }
}*/


