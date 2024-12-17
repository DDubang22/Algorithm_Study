package Baekjoon;

import java.util.*;

public class 베르트랑공준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();
            if(num == 0) break;
            int sum  = 0;

            for(int i = num + 1; i <= num*2; i++) {
                if (isPrimeNumber(i)) {
                    sum++;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    private static Boolean isPrimeNumber(int x) {
        double sqrt = Math.sqrt(x);
        for (int i = 2; i <= sqrt; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
}

