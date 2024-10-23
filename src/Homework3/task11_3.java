package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_3 {
    public static void main(String[] args) {
        Random rn = new Random();

        double[] massA = new double[15];
        double[] massB = new double[15];
        double[] massC = new double[15];
        double[] massD = new double[15];
        int[] massE = new int[15];

        for (int i = 0; i < 15; i++) {
            massA[i] = rn.nextDouble(0,1);
            massB[i] = rn.nextDouble(22,23);
            massC[i] = rn.nextDouble(0,10);
            massD[i] = rn.nextDouble(-50,50);
            massE[i] = rn.nextInt(0,11);
        }

        System.out.println(Arrays.toString(massA));
        System.out.println(Arrays.toString(massB));
        System.out.println(Arrays.toString(massC));
        System.out.println(Arrays.toString(massD));
        System.out.println(Arrays.toString(massE));
    }
}
