package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task5_27 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 100; i <= 500; i++) {
            total += i;
        }
        System.out.println(total);


        Scanner scanner = new Scanner(System.in);
        int total2 = 0;
        System.out.print("Введите число до 500:");
        int a = scanner.nextInt();
        for (int i = a; i <= 500; i++) {
            total2 += i;
        }
        System.out.println(total2);


        int total3 = 0;
        System.out.print("Введите число больше или равное -10:");
        int b = scanner.nextInt();
        for (int i = -10; i <= b; i++) {
            total3 += i;
        }
        System.out.println(total3);

        int total4 = 0;
        System.out.print("Введите первое число:");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число (число должно быть больше первого):");
        int b1 = scanner.nextInt();
        for (int i = a1; i <= b1; i++) {
            total4 += i;
        }
        System.out.println(total4);
    }
}
