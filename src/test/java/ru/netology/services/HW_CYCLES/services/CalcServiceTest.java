package ru.netology.services.HW_CYCLES.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void numberOfMonthsOne(int expected, int expenses, int income, int threshold) {
        CalcService service = new CalcService();
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    // @Test
    // public void numberOfMonthsTwo() {
    //     CalcService service = new CalcService();
    // подготавливаем данные:
    //   int expected = 3;
    //  int income = 10_000;
    //  int expenses = 3_000;
    //  int threshold = 20_000;
    // вызываем целевой метод:
    //  int actual = service.calculate(income, expenses, threshold);
    // производим проверку (сравниваем ожидаемый и фактический):
    //   Assertions.assertEquals(expected, actual);

    //}
}

