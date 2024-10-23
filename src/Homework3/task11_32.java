package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_32 {
    public static void main(String[] args) {
        Random random = new Random();
        int gruzopodemnost = 2000;
        int[] mass = new int[30];
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 150);
            sum += mass[i];
        }

        System.out.println(Arrays.toString(mass));
        System.out.println(String.format("Грузоподъемность авотомобиля %s", sum > gruzopodemnost ? "превышена" : "не превышена"));
    }
}
