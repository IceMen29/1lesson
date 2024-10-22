package Homework2;

import java.util.Scanner;

public class task6_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n:");
        int n = scanner.nextInt();
        int a = 1, b = 1;
        int nextFib = a + b;

        while (nextFib <= n) {
            a = b;
            b = nextFib;
            nextFib = a + b;
        }
        System.out.println(nextFib);


        int a1 = 1, b1 = 1;
        int nextFib1 = a1 + b1;
        int sumFib = a1 + b1 + nextFib1;
        while (nextFib1 <= 1000) {
            a1 = b1;
            b1 = nextFib1;
            nextFib1 = a1 + b1;
            if (nextFib1 <= 1000)
                sumFib += nextFib1;
        }
        System.out.println(sumFib);
    }
}
