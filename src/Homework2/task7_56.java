package Homework2;

import java.util.Arrays;
import java.util.OptionalInt;

public class task7_56 {
    public static void main(String[] args) {
        String[] citiesArray = {"Волгоград 965 км", "Екатеринбург 1745 км", "Казань 807 км", "Нижний Новгород 416 км"
                , "Новосибирск 3350 км", "Омск 2697 км", "Ростов-на-Дону 1070 км"};
        int[] distanceArray = {965, 1745, 807, 416, 3350, 2697, 1070};
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < citiesArray.length; i++) {
            if (distanceArray[maxIndex] < distanceArray[i]) {
                maxIndex = i;
            }
            if (distanceArray[minIndex] > distanceArray[i]) {
                minIndex = i;
            }
        }

        System.out.println("наибольшее расстояние от москвы: " + citiesArray[maxIndex]
                + "\nнаименьшее растояние от москвы: " + citiesArray[minIndex]);
    }

}
