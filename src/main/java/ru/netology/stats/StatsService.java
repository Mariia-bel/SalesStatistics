package ru.netology.stats;

public class StatsService {

    // метод Сумма всех продаж
    public long sumSales(long[] sales) { // Класс должен уметь работать с любыми значениями
        long sumSales = 0; //счетчик
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    // метод Средняя сумма продаж в месяц
    public long average(long[] sales) {
        long sumSales = sumSales(sales); //счетчик
        return sumSales / sales.length;
    }

    // метод Номер последнего месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
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

    // метод Номер последнего месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
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

    // метод Кол-во месяцев, в которых продажи были ниже среднего
    public int countMonthSalesBelowAverage(long[] sales) {
        long average = average(sales);
        long countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonth++;
            }
        }
        return (int) countMonth;

    }

    // метод Кол-во месяцев, в котоорых продажи были выше среднего
    public int countMonthSalesHigherAverage(long[] sales) {
        long average = average(sales); // с возможностью вызова другого метода стало намного удобнее и код сократился на 2/3.
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonth++;
            }
        }
        return countMonth;

    }
}
