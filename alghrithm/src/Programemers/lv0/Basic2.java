package Programemers.lv0;

import java.util.*;

public class Basic2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        String str = "hello";
        char[] charArray = str.toCharArray();
        char c1 = str.charAt(num1);
        char c2 = str.charAt(num2);
        charArray[num1] = c2;
        charArray[num2] = c1;
        String s = new String(charArray);
        System.out.println(s);
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

//문자열안에 문자열
/*class Solution {
    public int solution(String str1, String str2) {
        boolean contains = str1.contains(str2);
        return contains ? 1 : 2;
    }
}*/

//문자열 정렬하기(1)
/*import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String s = my_string.replaceAll("[a-z]","");
        String[] result = s.split("");
        int[] array = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        return array;

    }
}*/

//피자 나눠 먹기(2)
/*class Solution {
    public int solution(int n) {
        int a = n;
        int b = 6;
        int r = 0;

        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        int answer = (n * 6 / a) / 6;
        return answer;
    }
}*/

//배열 회전시키기
/*class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] arr = new int[numbers.length];

        if(direction.equals("right")) {
            arr[0] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length-1; i++) arr[i + 1] = numbers[i];
        }
        else {
            arr[numbers.length - 1] = numbers[0];
            for (int i = 0; i < numbers.length-1; i++) arr[i] = numbers[i+1];
        }

        return arr;

    }
}*/

//369 게임
/*class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);

        int count = 0;
        String[] result = str.split("");
        for (String s : result) {
            if ((Integer.parseInt(s) % 3 == 0) && Integer.parseInt(s) != 0)
                count++;
        }
        return count;
    }
}*/

//숫자 찾기
/*class Solution {
    public int solution(int num, int k) {
        String[] result = String.valueOf(num).split("");
        for(int i = 0; i < result.length; i++) {
            if(result[i].equals(String.valueOf(k)))
                return i+1;
        }
        return -1;
    }
}*/

//암호 해독
/*class Solution {
    public String solution(String cipher, int code) {
        char[] charArray = cipher.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = code-1; i < charArray.length; i+=code) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}*/

//인덱스 바꾸기
/*
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();

        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);

        charArray[num1] = c2;
        charArray[num2] = c1;

        return new String(charArray);
    }
}*/
