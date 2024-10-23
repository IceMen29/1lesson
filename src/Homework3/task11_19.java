package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class task11_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mass = {21, 123, 56, 123, 86, 899, 3, 61, 798};
        int a = 0;
        long b = 1L;
        int v = 0;
        int g = 0;
        int d = 0;
        double j = 0;

        System.out.println("Введите первый индекс");
        int k1 = sc.nextInt();
        System.out.println("Введите второй индекс");
        int k2 = sc.nextInt();

        System.out.println("Введите первый индекс");
        int s1 = sc.nextInt();
        System.out.println("Введите второй индекс");
        int s2 = sc.nextInt();


        for (int intInMass : mass) {
            a += intInMass;
            b *= intInMass;
            v += Math.pow(intInMass, 2);
        }

        double e = (double) a / mass.length;

        for (int i = 0; i < 6; i++) {
            g += mass[i];
        }

        for (int i = k1 - 1; i <= k2 - 1; i++) {
            d += mass[i];
        }

        for (int i = s1 - 1; i <= s2 - 1; i++) {
            j += mass[i];
        }

        j = j / ((s2 - s1) + 1);

        System.out.println("Исходный массив: " + Arrays.toString(mass));
        System.out.println("а) " + a);
        System.out.println("б) " + b);
        System.out.println("с) " + v);
        System.out.println("г) " + g);
        System.out.println("д) " + d);
        System.out.printf("е) %.2f\n", e);
        System.out.printf("ж) %.2f\n", j);


    }
}
