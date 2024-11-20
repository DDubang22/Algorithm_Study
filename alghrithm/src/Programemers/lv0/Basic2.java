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

//외계행성의 나이
/*class Solution {
    public String solution(int age) {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put("0","a");
        map.put("1","b");
        map.put("2","c");
        map.put("3","d");
        map.put("4","e");
        map.put("5","f");
        map.put("6","g");
        map.put("7","h");
        map.put("8","i");
        map.put("9","j");

        String[] result = String.valueOf(age).split("");
        for (String s : result) {
            if (map.containsKey(s)) {
                sb.append(map.get(s));
            }
        }
        return sb.toString();
    }
}*/

//팩토리얼
/*
class Solution {
    public int solution(int n) {
        int sum = 1;
        int i = 0;

        while (sum <= n) {
            i++;
            sum *= i;
        }
        return i-1;
    }
}*/

//k의 개수(답지봄)
/*class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;

        for(; i <=j; i++) {
            int n = i;

            while(n > 0) {
                if(n % 10 == k) {
                    count++;
                }
                n /= 10;
            }
        }
        return count;
    }
}*/

//중복된 문자 제거
/*class Solution {
    public String solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        String[] result = my_string.split("");

        for(String s : result) {
            if(!list.contains(s)) {
                list.add(s);
            }
        }

        for(String s : list) {
            sb.append(s);
        }

        return sb.toString();
    }
}*/

//문자열 정렬하기(2)
/*
class Solution {
    public String solution(String my_string) {
        String lowerStr = my_string.toLowerCase();
        StringBuilder sb = new StringBuilder();

        char[] charArray = lowerStr.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();

        for(char c : charArray) list.add((int) c);

        Collections.sort(list);

        for(Integer i : list) {
            char ch = (char) i.intValue();
            sb.append(ch);
        }

        return sb.toString();
    }

===
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
}*/

//가까운 수
/*class Solution {
    public int solution(int[] array, int n) {
        int distance;
        int shortDistance = 100;
        int shortTarget = 0;

        Arrays.sort(array);

        for (int i : array) {
            distance = Math.abs(n - i);
            if (distance < shortDistance) {
                shortDistance = distance;
                shortTarget = i;
            } else {
                if (shortTarget != i) {
                    shortTarget = Math.min(shortTarget, i);
                }
            }
        }
        return shortTarget;
    }
}*/

//A를 B로 만들기
/*class Solution {
    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        if(Arrays.equals(beforeArray, afterArray))
            return 1;
        return 0;
    }
}*/

//7의 개수
/*class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i : array)
            sb.append(Integer.valueOf(i));

        String newString = sb.toString();
        int count = 0;
        String[] split = newString.split("");
        for (String s : split) {
            if(s.equals("7")){
                count++;
            }
        }
        return count;
    }
}*/


