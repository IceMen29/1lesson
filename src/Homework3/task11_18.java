package Homework3;

import java.util.Arrays;

public class task11_18 {
    public static void main(String[] args) {
        int[] mass = {5, 4, 3, 2, 1, 5, 5, 53, 34, 4, 65, 2};
        int[] massA = new int[mass.length];
        int[] massB = new int[mass.length];
        int[] massC = new int[mass.length];

        int b = 5;

        for (int i = 0; i < mass.length; i++) {
            massA[i] = mass[i] - 20;
            massB[i] = mass[i] * mass[mass.length - 1];
            massC[i] = mass[i] + b;
        }
        System.out.println("Исходный массив: " + Arrays.toString(mass));
        System.out.println("а) " + Arrays.toString(massA));
        System.out.println("б) " + Arrays.toString(massB));
        System.out.println("в) " + Arrays.toString(massC));
    }
}
