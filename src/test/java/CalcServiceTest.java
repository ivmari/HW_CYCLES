import org.junit.jupiter.api.Test;
import ru.netology.services.HW_CYCLES.services.CalcService;
import org.junit.jupiter.api.Assertions;

public class CalcServiceTest {
    @Test
    public void numberOfMonthsOne() {
        CalcService service = new CalcService();
        // подготавливаем данные:
        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsTwo() {
        CalcService service = new CalcService();
        // подготавливаем данные:
        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}

