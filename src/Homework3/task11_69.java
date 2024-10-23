package Homework3;

import java.util.Scanner;

public class task11_69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass = {1, 2, 3, 4, 5, 6, 7};
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a > mass.length) {
            System.out.println("Элементов в этом диапазоне не найдено");
        } else if(b > mass.length) {
            System.out.println("Количество эл-ов в этом диапазоне " + (mass.length - a + 1));
        } else {
            System.out.println("Количество эл-ов в этом диапазоне " + (b - a + 1));
        }


    }
}
