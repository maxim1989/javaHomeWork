public class Main {
    public static void main(String[] args) {
//        Task 1
//        char clientOS = 0;
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//        Task 2
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//        Task 3
//        short year = 1684;
//        short year = 1784;
//        short year = 1984;
//        short year = 2020;
        short year = 2021;
//        short year = 2024;
        int diff = year - 1584;

        if (diff >= 0 && diff % 400 == 0) {
            System.out.printf("%d год является високосным\n", year);
        } else if (diff >= 0 && diff % 100 == 0) {
            System.out.printf("%d год не является високосным\n", year);
        } else if (diff >= 0 && diff % 4 == 0) {
            System.out.printf("%d год является високосным\n", year);
        } else {
            System.out.printf("%d год не является високосным\n", year);
        }
//        Task 4
//        int deliveryDistance = 19;
//        int deliveryDistance = 20;
//        int deliveryDistance = 59;
//        int deliveryDistance = 60;
//        int deliveryDistance = 70;
//        int deliveryDistance = 99;
        int deliveryDistance = 101;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
//        Task 5
//        byte monthNumber = 1;
//        byte monthNumber = 2;
//        byte monthNumber = 3;
//        byte monthNumber = 4;
//        byte monthNumber = 5;
//        byte monthNumber = 6;
//        byte monthNumber = 7;
//        byte monthNumber = 8;
//        byte monthNumber = 9;
//        byte monthNumber = 10;
//        byte monthNumber = 11;
//        byte monthNumber = 12;
        byte monthNumber = 44;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц не существует");
        }
    }
}