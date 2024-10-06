import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int c = 20;
        int d = 45;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;

        double sum1 = a1 + a2;

        System.out.println(sum1);

        float f1 = 10.2f;
        float f2 = 15.3f;

        float sum2 = f1 + f2;

        System.out.println(sum2);

        boolean trueVar = true;
        boolean falseVar = false;

        char digit = '1';
        String digits = "123456";

        boolean sumBool = true && false;
        boolean antiTrueVar = !trueVar;

        String str1 = "Hello ";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(a1 + str3);

        int calculation = (1+2)*3*(4+8);

        System.out.println(calculation);

        Scanner reader = new Scanner(System.in);
        int age = reader.nextInt();

        if (age >= 18 && age <= 25) {
            System.out.println("Предъяви документы будет продано");
        } else if (age >= 25 && age < 65) {
            System.out.println("Продаем");
        } else if (age >= 65 && age < 100) {
            System.out.println("Продаем и также продаем лекарства");
        } else {
            System.out.println("Куда ему продавать123");
        }
    }
}