package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    // тест на метод Сумма всех продаж
    @Test
    public void shoudSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    // тест на метод Средняя сумма продаж в месяц
    @Test
    public void shouldCountAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;

        Assertions.assertEquals(expected, actual);
    }

    // тест на метод Номер последнего месяца, в котором был пик продаж
    @Test
    public void showMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    // тест нак метод Номер последнего месяца, в котором был минимум продаж
    @Test
    public void showMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    // тест на метод Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldCountMonthSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countMonthSalesBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    // тест на метод Кол-во месяцев, в котоорых продажи были выше среднего
    @Test
    public void shouldCountMonthSalesHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countMonthSalesHigherAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
