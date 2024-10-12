package Lesson1;

public class Homework1 {

    public static void main(String[] args) {
        //2.5
        int weekResult = 234 / 7;
        System.out.println("2.5");
        System.out.println(weekResult + " прошло полных недель\n");

        //2.6
        int n = 86401; //Предположим что прошло 86400 секунд
        System.out.println("2.6");
        System.out.println("a)" + (n / 3600) + " часа(ов) прошло с начала суток");
        System.out.println("б)" + (n - ((n / 3600) * 3600)) / 60 + " минут(а) прошло с начала последнего часа");
        System.out.println("б)" + (n - ((n / 60) * 60)) + " секунд(а) прошло с последней минуты\n");

        //2.13
        int x = 934; //любое исходное число
        System.out.println("2.13");
        System.out.print("Полученное число слева направо ");
        System.out.print(x % 10);
        System.out.print((x % 100) / 10);
        System.out.println((x / 100) + "\n");

        //2.19
        int x1 = 1111; // четырехзначное число
        int sum = (x1 / 1000) + (x1 / 100 % 10) + (x1 % 100 / 10) + (x1 % 10);
        System.out.println("2.19");
        System.out.println("сумма цифр: " + sum + "\n");

        //4.8
        int kmDistance = 3050;
        int feetDistance = 10000;
        System.out.println("4.8");
        if (kmDistance * 1000 < feetDistance * 305) {
            System.out.println("Дистанция в километрах меньше\n");
        } else if (kmDistance * 1000 > feetDistance * 305) {
            System.out.println("Дистанция в фунтах меньше\n");
        } else {
            System.out.println("Расстояние одинаковое\n");
        }

        //4.9
        int kmHourSpeed = 60;
        int mSecondSpeed = 17;
        System.out.println("4.9");
        if (kmHourSpeed * 1000 < mSecondSpeed * 3600) {
            System.out.println("Скорость в километрах в час меньше\n");
        } else if (kmHourSpeed * 1000 > mSecondSpeed * 3600) {
            System.out.println("Скорость в метрах в секунду меньше\n");
        } else {
            System.out.println("Скорость одинаковая\n");
        }

        //4.10
        System.out.println("4.10");
        int radiusCircle = 10;
        int edgeSquare = 10;
        if ((radiusCircle * 3.14) * (radiusCircle * 3.14) > (edgeSquare * edgeSquare)) {
            System.out.println("Площадь круга больше\n");
        } else if ((radiusCircle * 3.14) * (radiusCircle * 3.14) < (edgeSquare * edgeSquare)) {
            System.out.println("Площадь квадрата больше\n");
        } else {
            System.out.println("Площади фигур равны\n");
        }

        //4.13
        int a = 5;
        int b = 10;
        int c = 15;
        int Discriminant = (b * b) - (4 * a * c);
        System.out.println("4.13");
        if (Discriminant == 0) {
            System.out.println("Уравнение имеет один корень\n");
        } else if (Discriminant > 0) {
            System.out.println("Уравнение имеет два корня\n");
        } else {
            System.out.println("В уравнении нет корней\n");
        }
        //4.36
        int t = 6;
        System.out.println("4.36");
        if (t % 5 < 3) {
            System.out.println("Горит зеленый\n");
        } else {
            System.out.println("Горит красный\n");
        }

        //4.96
        int a1 = 5;
        int b1 = 10;
        int c1 = 4;
        int Discriminant1 = (b1 * b1) - (4 * a1 * c1);
        System.out.println("4.96");
        if (Discriminant1 == 0) {
            System.out.println("Уравнение имеет один корень x = " + ((-b1) / (2 * a1)) + "\n");
        } else if (Discriminant1 > 0) {
            System.out.println("Уравнение имеет два корня x1 = " + (((-b) + Math.sqrt(Discriminant1)) / (2 * a))
                    + ", x2 = " + (((-b) - Math.sqrt(Discriminant1)) / (2 * a)) + "\n");
        } else {
            System.out.println("В уравнении нет корней\n");
        }

        //4.97
        System.out.println("4.97");
        int firstDigit = 5;
        int secondDigit = 19;
        int thirdDigit = 1;
        int min = 0;
        int max = 0;
        if (firstDigit > secondDigit && firstDigit > thirdDigit) {
            System.out.println("Самое большое 1 число");
            max = firstDigit;
        }
        if (secondDigit > firstDigit && secondDigit > thirdDigit) {
            System.out.println("Самое большое 2 число");
            max = secondDigit;
        }
        if (thirdDigit > firstDigit && thirdDigit > secondDigit) {
            System.out.println("Самое большое 3 число");
            max = thirdDigit;
        }
        if (firstDigit < secondDigit && firstDigit < thirdDigit) {
            System.out.println("Самое маленькое 1 число");
            min = firstDigit;
        }
        if (secondDigit < firstDigit && secondDigit < thirdDigit) {
            System.out.println("Самое маленькое 2 число");
            min = secondDigit;
        }
        if (thirdDigit < firstDigit && thirdDigit < secondDigit) {
            System.out.println("Самое маленькое 3 число");
            min = thirdDigit;
        }
        if (firstDigit > min && firstDigit < max) {
            System.out.println("1 число является средним");
        }
        if (secondDigit > min && secondDigit < max) {
            System.out.println("2 число является средним");
        }
        if (thirdDigit > min && thirdDigit < max) {
            System.out.println("3 число является средним");
        }
        System.out.println();

        //4.122
        System.out.println("4.122");
        int a2 = 5;
        int b2 = 10;
        int c2 = 20;
        if ((a2 + b2 > c2) && (a2 + c2 > b2) && (c2 + b2 > a2)){
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольника не существует");
        }

    }
}
