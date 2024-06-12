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
        task9();
        task10();
    }

    public static void task1() {
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        int deposit = 29_000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }
    }

    public static void task9() {
        int deposit = 29_000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum = totalSum + deposit + (totalSum + deposit) / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d\n", i, 2 * i);
        }
    }
}
