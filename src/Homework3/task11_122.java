package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_122 {
    public static void main(String[] args) {
        Random generator = new Random();

        int min = 200;
        int counter = 0;
        int[] booksCosts = new int[60];

        for (int i = 0; i < booksCosts.length; i++) {
            booksCosts[i] = generator.nextInt(100, 200);
        }

        for (int i = 0; i < booksCosts.length; i++) {
            if (min > booksCosts[i]) {
                min = booksCosts[i];
                counter = 0;
            }
            if (min == booksCosts[i]) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(booksCosts));
        System.out.println("Минимальная цена: " + min + "\nКоличество книг с такой ценой: " + counter);
    }
}
