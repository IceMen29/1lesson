package Homework2;

public class task8_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("5 ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 41; j <= 50; j++) {
                System.out.print(j + (i * 10) + " ");
            }
            System.out.println();
        }

    }
}
