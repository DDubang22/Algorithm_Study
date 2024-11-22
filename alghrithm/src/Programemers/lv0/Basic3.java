package Programemers.lv0;


import java.util.*;

public class Basic3 {
    public static void main(String[] args) {

    }
}


//문자열 곱하기
/*class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}*/

//문자열 붙여서 출력하기
/*public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.print(a.trim());
        System.out.print(b.trim());
    }
}*/

//정수 부분
/*class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}*/

//뒤에서 5등까지
/*class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for(int i =0; i < 5;i++)
            answer[i] = num_list[i];

        return answer;
    }
}*/

//배열 비교하기
/*class Solution {
    public int solution(int[] arr1, int[] arr2) {

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        if(arr1Len < arr2Len)
            return -1;
        else {
            if(arr1Len == arr2Len) {
                int sum1 = 0, sum2 = 0;
                for(int i : arr1)
                    sum1 +=i;

                for(int i : arr2)
                    sum2 +=i;
                return sum1 < sum2 ? -1 : sum1 == sum2 ? 0 : 1;
            }
            return 1;
        }
    }
}*/
