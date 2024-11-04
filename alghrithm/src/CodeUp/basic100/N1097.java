package CodeUp.basic100;

import java.util.Scanner;

public class N1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[20][20];

        for (int i = 1; i < array.length; i++)
            for (int j = 1; j < array[i].length; j++)
                array[i][j] = sc.nextInt();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 1; j < 20; j++) {
                if(array[x][j] == 0) array[x][j] = 1;
                else array[x][j] = 0;
            }

            int y = sc.nextInt();
            for (int j = 1; j < 20; j++) {
                if(array[j][y] == 0) array[j][y] = 1;
                else array[j][y] = 0;
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
