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

        while (resultSum < 2_459_000) {
            resultSum += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month++, resultSum);
        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        i--;
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        float totalAmount = 12_000_000f;
        int fertility = 17;
        int mortality = 8;
        for (byte i = 1; i <= 10; i++) {
            float thousands = totalAmount / 1000f;
            float bornPeople = thousands * fertility;
            float deadPeople = thousands * mortality;
            totalAmount = totalAmount + bornPeople - deadPeople;
            System.out.printf("Год %d, численность населения составляет %d\n", i, Math.round(totalAmount));
        }
    }

    public static void task4() {
        float deposit = 15_000f;
        int month = 1;

        while (deposit < 12_000_000) {
            deposit = deposit + (deposit / 100) * 7;
            System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            month++;
        }
    }

    public static void task5() {
        float deposit = 15_000f;
        int month = 1;

        while (deposit < 12_000_000) {
            deposit = deposit + (deposit / 100) * 7;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task6() {
        float deposit = 15_000f;
        int month = 1;
        int totalMonths = 9 * 12;

        while (month <= totalMonths) {
            deposit = deposit + (deposit / 100) * 7;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма %f\n", month, deposit);
            }
            month++;
        }
    }

    public static void task7() {
        int friday = 7;

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += 7;
        } while (friday <= 31);
    }

    public static void task8() {
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int i = 0; i <= endYear; i++) {
            if (i % 79 == 0 && i >= startYear) {
                System.out.println(i);
            }
        }
    }
}