package CodeUp.basic100;

import java.util.Scanner;

public class N1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 0) System.out.println("plus");
        else System.out.println("minus");

        if(Math.abs(num) % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}
