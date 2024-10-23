package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task11_43 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[] massTemp = new boolean[31];
        int counter = 0;
        for (int i = 0; i < massTemp.length; i++) {
            massTemp[i] = random.nextBoolean();
            if (!massTemp[i]){
                counter++;
                System.out.println(i + 1 + " января не было осадков");
            }
        }
        System.out.println(Arrays.toString(massTemp));
        System.out.println(counter);
    }

}
