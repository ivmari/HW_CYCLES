package ru.netology.services.HW_CYCLES.services;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count;
        count = service.calculate(income, expenses, threshold);
        System.out.println("Фактическое количество месяцев: " + count + " месяцев");
        System.out.println("Ожидаемое количество месяцев: " + expected + " месяцев");
    }
}