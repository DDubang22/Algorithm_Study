package CodeUp.basic100;

import java.util.Scanner;

public class N1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        long saveSize = (long) h * b * c * s;
        double byte_size = convertByte(saveSize);
        double kb = convertKb(byte_size);
        double mb = convertMb(kb);
        System.out.printf("%.1f MB",mb);
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
