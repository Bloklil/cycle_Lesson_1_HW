import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for (int q = 0; q <= 10; q++) {
            System.out.println(q);
        }

        System.out.println("Задание 2");
        for (int q1 = 10; q1 >= 0; q1 = q1 - 1) {
            System.out.println(q1);
        }

        System.out.println("Задание 3");
        for (int q2 = 0; q2 < 17; q2 = q2 + 2) {
            System.out.println(q2);
        }

        System.out.println("Задание 4");
        for (int q3 = 10; q3 >= -10; q3 = q3 - 1) {
            System.out.println(q3);
        }

        System.out.println("Задание 5");
        for (int q4 = 1904; q4 <= 2096; q4 = q4 + 4) {
            System.out.println(q4 + " год является високосным");
        }

        System.out.println("Задание 6");
        for (int q5 = 7; q5 <= 98; q5 = q5 + 7) {
            System.out.println(q5);
        }

        System.out.println("Задание 7");
        for (int q6 = 2; q6 <= 512; q6 = q6 * 2) {
            System.out.println(q6);
        }

        System.out.println("Задание 8");
        int sum = 29000;
        double total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + sum;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 9");
        int sum1 = 29000;
        double total1 = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total1 = total1 + sum1 + (total1 + sum1) * 0.01;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println("Задание 10");
        int namber = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(namber + "*" + i + "=" + namber * i);
        }


    }

}