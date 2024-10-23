package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_45 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[31];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 100000);
        }

        System.out.println(Arrays.toString(mass));

        for (int i = 1; i < mass.length; i+= 2) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i+= 2) {
            System.out.print(mass[i] + " ");
        }

    }
}
