package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        boolean isPaid = false;

        while (!isPaid) {
            year++;

            double overpayment = ( amount / 100 ) * percent;
            amount = (amount + overpayment) - salary;

            if (amount < 0) {
                isPaid = true;
            }
        }

        return year;
    }
}
