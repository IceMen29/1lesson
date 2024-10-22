package Homework2;

public class task8_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i <= 9; i++) {
            for (int j = 5; j >= 10 - i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*10 + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i * 5 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
