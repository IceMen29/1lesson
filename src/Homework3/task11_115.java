package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_115 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[40];

        int maxSpeed = 0;
        int firstIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(60, 120);
        }

        for (int i = 0; i < mass.length; i++) {
            if (maxSpeed < mass[i]) {
                maxSpeed = mass[i];
                lastIndex = 0;
                firstIndex = i;
            } else if (maxSpeed == mass[i]) {
                lastIndex = i;
            }
        }

        System.out.println(Arrays.toString(mass));

        if (lastIndex == 0) {
            System.out.println("Номер самого быстрого автомобиля: " + firstIndex);
        } else {
            System.out.println("Автомобилей с максимальной скоростью несколько: первый из них - "
                    + firstIndex + "\nПоследний из них - " + lastIndex);
        }

    }
}
