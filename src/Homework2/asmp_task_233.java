package Homework2;

import java.util.Scanner;

public class asmp_task_233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCrash = false;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            if (sc.nextInt() < 437) {
                System.out.println("Crash " + i);
                isCrash = true;
                break;
            }
        }
        if (!isCrash) {
            System.out.println("No crash");
        }
    }
}
