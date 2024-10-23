package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_46 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] mass = new double[31];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextDouble(-100, 100);
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) mass[i] = Math.abs(mass[i]);
            if (i % 2 != 0) mass[i] = Math.sqrt(mass[i]);
        }

        System.out.println(Arrays.toString(mass));
    }
}
