package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_71 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massOcenok = new int[10];
        int count = 0;
        for (int i = 0; i < massOcenok.length; i++) {
            massOcenok[i] = random.nextInt(2, 6);
        }
        System.out.println(Arrays.toString(massOcenok));
        for (int ocenka : massOcenok) {
            if (ocenka >= 4) {
                count++;
            }
        }
        System.out.println("количество пятерок и четверок: " + count);
    }
}
