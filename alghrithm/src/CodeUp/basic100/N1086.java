package CodeUp.basic100;

import java.util.Scanner;

public class N1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        long savedSize = (long) w * h * b;

        double cByte = convertByte(savedSize);
        double cKb = convertKb(cByte);
        double cMb = convertMb(cKb);
        System.out.printf("%.2f MB",cMb);
    }

    static double convertByte(double bit) {
        return bit / 8;
    }

    static double convertKb(double Byte) {
        return Byte / 1024;
    }

    static double convertMb(double Kb) {
        return Kb / 1024;
    }
}
