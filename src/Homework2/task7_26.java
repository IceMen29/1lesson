package Homework2;

import java.util.Random;

public class task7_26 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tempArray = new int[r.nextInt(30, 31)];
        int totalDays = 0;
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = r.nextInt(-30, 30);
            System.out.print(tempArray[i] + " ");
            if (tempArray[i] < 0){
                totalDays++;
            }
        }

        System.out.println("\nВ месяце было " + totalDays + " дней когда температура опустилась ниже нуля");
    }
}
