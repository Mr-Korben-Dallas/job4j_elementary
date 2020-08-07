package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = 0; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumByEven(1, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 5));
        System.out.println(sum(10, 90));
    }
}
