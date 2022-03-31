package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int averageSum = calcSum(sales) / sales.length;
        return averageSum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int lowerMonths(int[] sales) {
        int averageSum = averageSum(sales);
        int badMonths = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                badMonths++;
            }
        }
        return badMonths;
    }

    public int higherMonths(int[] sales) {
        int averageSum = averageSum(sales);
        int goodMonths = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                goodMonths++;
            }
        }
        return goodMonths;
    }
}

