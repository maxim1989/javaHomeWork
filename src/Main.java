public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] costsAmount = {100, 230, 30, 45, 11};
        int totalAmount = 0;
        for (final int costAmount : costsAmount) {
            totalAmount += costAmount;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", totalAmount);
    }

    public static void task2() {
        int[] costsAmount = {100, 230, 30, 45, 10};
        int minAmount = costsAmount[0];
        int maxAmount = costsAmount[0];
        for (final int costAmount : costsAmount) {
            if (minAmount > costAmount) {
                minAmount = costAmount;
            }
            if (maxAmount < costAmount) {
                maxAmount = costAmount;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей\n", minAmount, maxAmount);
    }

    public static void task3() {
        double[] costsAmount = {100, 230, 30, 45, 11};
        double totalAmount = 0;
        for (final double costAmount : costsAmount) {
            totalAmount += costAmount;
        }
        double mediumAmount = totalAmount / costsAmount.length;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n", mediumAmount);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}