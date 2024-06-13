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
        int target = 2_459_000;

        while (resultSum < target) {
            resultSum += deposit + (resultSum + deposit) / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month++, resultSum);
        }
    }

    public static void task2() {
        int i = 1;
        byte firstStep = 1;
        byte lastStep = 10;
        while (i <= lastStep) {
            System.out.print(i++ + " ");
        }
        i--;
        System.out.println();
        for (; i >= firstStep; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        float totalAmount = 12_000_000f;
        int fertility = 17;
        int mortality = 8;
        float unit = 1_000f;
        for (byte i = 1; i <= 10; i++) {
            float thousands = totalAmount / unit;
            float bornPeople = thousands * fertility;
            float deadPeople = thousands * mortality;
            totalAmount = totalAmount + bornPeople - deadPeople;
            System.out.printf("Год %d, численность населения составляет %d\n", i, Math.round(totalAmount));
        }
    }

    public static void task4() {
        float deposit = 15_000f;
        int month = 1;
        int target = 12_000_000;
        int percentsByMonth = 7;

        while (deposit < target) {
            deposit = deposit + (deposit / 100) * percentsByMonth;
            System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            month++;
        }
    }

    public static void task5() {
        float deposit = 15_000f;
        int month = 1;
        int target = 12_000_000;
        int percentsByMonth = 7;
        int period = 6;

        while (deposit < target) {
            deposit = deposit + (deposit / 100) * percentsByMonth;
            if (month % period == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task6() {
        float deposit = 15_000f;
        int month = 1;
        int totalMonths = 9 * 12;
        int period = 6;
        int percentsByMonth = 7;

        while (month <= totalMonths) {
            deposit = deposit + (deposit / 100) * percentsByMonth;
            if (month % period == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task7() {
        int friday = 7;
        int period = 7;
        int daysInMonth = 31;

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += period;
        } while (friday <= daysInMonth);
    }

    public static void task8() {
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int period = 79;
        for (int i = 0; i <= endYear; i++) {
            if (i % period == 0 && i >= startYear) {
                System.out.println(i);
            }
        }
    }
}