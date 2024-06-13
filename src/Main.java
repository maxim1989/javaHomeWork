public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int deposit = 15_000;
        int resultSum = 0;
        int month = 1;
        final int TARGET = 2_459_000;

        while (resultSum < TARGET) {
            resultSum += deposit + (resultSum + deposit) / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month++, resultSum);
        }
    }

    public static void task2() {
        int i = 1;
        final byte FIRST_STEP = 1;
        final byte LAST_STEP = 10;
        while (i <= LAST_STEP) {
            System.out.print(i++ + " ");
        }
        i--;
        System.out.println();
        for (; i >= FIRST_STEP; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        float totalAmount = 12_000_000f;
        final int FERTILITY = 17;
        final int MORTALITY = 8;
        final float UNIT = 1_000f;
        for (byte i = 1; i <= 10; i++) {
            float thousands = totalAmount / UNIT;
            float bornPeople = thousands * FERTILITY;
            float deadPeople = thousands * MORTALITY;
            totalAmount = totalAmount + bornPeople - deadPeople;
            System.out.printf("Год %d, численность населения составляет %d\n", i, Math.round(totalAmount));
        }
    }

    public static void task4() {
        float deposit = 15_000f;
        int month = 1;
        final int TARGET = 12_000_000;
        final int PERCENTS_BY_MONTH = 7;

        while (deposit < TARGET) {
            deposit += (deposit / 100) * PERCENTS_BY_MONTH;
            System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            month++;
        }
    }

    public static void task5() {
        float deposit = 15_000f;
        int month = 1;
        final int TARGET = 12_000_000;
        final int PERCENTS_BY_MONTH = 7;
        final int PERIOD = 6;

        while (deposit < TARGET) {
            deposit += (deposit / 100) * PERCENTS_BY_MONTH;
            if (month % PERIOD == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task6() {
        float deposit = 15_000f;
        int month = 1;
        final int TOTAL_MONTHS = 9 * 12;
        final int PERIOD = 6;
        final int PERCENTS_BY_MONTH = 7;

        while (month <= TOTAL_MONTHS) {
            deposit += (deposit / 100) * PERCENTS_BY_MONTH;
            if (month % PERIOD == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task7() {
        int friday = 7;
        final int PERIOD = 7;
        final int DAYS_IN_MONTH = 31;

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += PERIOD;
        } while (friday <= DAYS_IN_MONTH);
    }

    public static void task8() {
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        final int PERIOD = 79;
        for (int i = 0; i <= endYear; i++) {
            if (i % PERIOD == 0 && i >= startYear) {
                System.out.println(i);
            }
        }
    }
}