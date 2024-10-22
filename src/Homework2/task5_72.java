package Homework2;

public class task5_72 {
    public static void main(String[] args) {
        double run7days = 10;
        double total = 10;
        System.out.println(String.format("Лыжник в день %d пробежал %d киллометров", 1, 10));
        for (int i = 2; i <= 10; i++) {
            total *= 1.1;
            System.out.println(String.format("Лыжник в день %d пробежал %.4f киллометров", i, total));
            if (i <= 7) {
                run7days += total;
            }
        }
        System.out.println(String.format("За первые 7 дней лыжнык пробежал %.4f", run7days));
    }
}
