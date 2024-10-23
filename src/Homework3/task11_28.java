package Homework3;

public class task11_28 {
    public static void main(String[] args) {
        int[] mass = {21, 123, 56, 123, 86, -899, 3, -61, -798};
        int sum = 0;
        for (int i : mass) {
            sum += i;
        }
        String result = sum >= 0 ? "Сумма всех членов не отрицательна" : "Сумма всех членов отрицательна";
        System.out.println(result);
    }
}
