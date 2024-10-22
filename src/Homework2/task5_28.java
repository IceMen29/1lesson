package Homework2;

import java.util.Scanner;

public class task5_28 {
    public static void main(String[] args) {
        int total = 1;
        for (int i = 8; i <= 15; i++) {
            total *= i;
        }
        System.out.println(total);


        Scanner scanner = new Scanner(System.in);
        int total1 = 1;
        System.out.print("Введите первое число:");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число (число должно быть больше первого):");
        int b1 = scanner.nextInt();
        for (int i = a1; i <= b1; i++) {
            total1 *= i;
        }
        System.out.println(total1);
    }
}
