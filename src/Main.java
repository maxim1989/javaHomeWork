public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean isLeapYear(int year) {
        final int START_YEAR = 1584;
        return year >= START_YEAR && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void task1() {
        int year = 1684;
        boolean leapYear = isLeapYear(year);

        if (leapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void selectDeviceVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        selectDeviceVersion(1, 2015);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return 3;
        }

        return -1;
    }

    public static void task3() {
        int days = calculateDeliveryDays(99);

        if (days >= 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}