package CodeUp.basic100;

import java.util.Scanner;

public class N1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[20][20];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            array[x][y] = 1;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
