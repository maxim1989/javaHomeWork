public class Main {
    public static void main(String[] args) {
        // Task 1
        byte byteType = 1;
        System.out.println("Значение переменной byteType с типом byte равно " + byteType);
        short shortType = 200;
        System.out.println("Значение переменной shortType с типом short равно " + shortType);
        int intType = 33_000;
        System.out.println("Значение переменной intType с типом int равно " + intType);
        long longType = 3_000_000_000L;
        System.out.println("Значение переменной longType с типом long равно " + longType);
        float floatType = 4.7777777f;
        System.out.println("Значение переменной floatType с типом float равно " + floatType);
        double doubleType = 8.1616161616161616;
        System.out.println("Значение переменной doubleType с типом doubleType равно " + doubleType);
        // Task 2
        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27_897;
        byte var7 = 67;
        // Task 3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short leafs = 480;
        int leafsOnStudent = leafs / (lpStudents + asStudents + eaStudents);  // TODO Сложение всегда int вернёт, поэтому int
        System.out.println("На каждого ученика рассчитано " + leafsOnStudent + " листов бумаги");
        // Task 4
        byte bottlesInMinute = 16 / 2;
        byte hoursInDay = 24;
        byte minutesInHour = 60;
        int minutesInDay = hoursInDay * minutesInHour; // TODO Почему short не подходит, умножение int вернёт? 24 * 60 = 1440
        byte daysInMonth = 30;
        byte minutes20 = 20;
        byte days3 = 3;
        int performanceFor20Minutes = bottlesInMinute * minutes20;
        System.out.println("За 20 минут машина произвела " + performanceFor20Minutes + " штук бутылок");
        int performanceFor1Day = bottlesInMinute * minutesInDay; // TODO Почему int подходит? Что если число в long попадает?
        System.out.println("За сутки машина произвела " + performanceFor1Day + " штук бутылок");
        int performanceFor3Days = bottlesInMinute * minutesInDay * days3;
        System.out.println("За 3 дня машина произвела " + performanceFor3Days + " штук бутылок");
        int performanceFor1Month = bottlesInMinute * minutesInDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + performanceFor1Month + " штук бутылок");
        // Task 5
        byte cans = 120;
        byte needWhiteCans = 2;
        byte needBrownCans = 4;
        int classesAmount = cans / (needWhiteCans + needBrownCans);
        int whiteCans = classesAmount * needWhiteCans;
        int brownCans = classesAmount * needBrownCans;
        System.out.println("В школе, где " + classesAmount + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
        // Task 6
        byte bananaWeightGr = 80;
        byte bananasCount = 5;
        byte milk100MlInGr = 105;
        short milkMl = 200;
        byte iceCreamWeightGr = 100;
        byte iceCreamCount = 2;
        byte eggWeightGr = 70;
        byte eggsCount = 4;
        short kiloInGr = 1000;
        int allBananasWeightGr = bananaWeightGr * bananasCount;
        int allMilkGr = (milkMl / 100) * milk100MlInGr;
        int allIceCreamGr = iceCreamWeightGr * iceCreamCount;
        int allEggsGr = eggWeightGr * eggsCount;
        int sumGr = allBananasWeightGr + allMilkGr + allIceCreamGr + allEggsGr;
        float sumKg = (float) sumGr / kiloInGr;
        System.out.println("Вес в граммах " + sumGr);
        System.out.println("Вес в килограммах " + sumKg);
        // Task 7
        byte weightKg = 7;
        int weightGr = weightKg * 1000;
        short grByDayMin = 250;
        short grByDayMax = 500;
        int grByDayMid = (grByDayMin + grByDayMax) / 2;
        int daysMin = weightGr / grByDayMin;
        int daysMax = weightGr / grByDayMax;
        double daysMid = (double) weightGr / grByDayMid;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм " + daysMin);
        System.out.println("Если каждый день будет худеть на 500 граммх " + daysMax);
        System.out.println("Дней в среднем " + daysMid);
        // Task 8
        int marySalary = 67_760;
        float marySalary10 = marySalary * 1.1f;
        float maryDiff = marySalary10 * 12 - marySalary * 12;
        System.out.println("Маша теперь получает " + marySalary10 + " рублей. Годовой доход вырос на " + maryDiff + " рублей");
        int danSalary = 83_690;
        float danSalary10 = danSalary * 1.1f;
        float danDiff = danSalary10 * 12 - danSalary * 12;
        System.out.println("Денис теперь получает " + danSalary10 + " рублей. Годовой доход вырос на " + danDiff + " рублей");
        int cristinaSalary = 76_230;
        float cristinaSalary10 = cristinaSalary * 1.1f;
        float cristinaDiff = cristinaSalary10 * 12 - cristinaSalary * 12;
        System.out.println("Кристина теперь получает " + cristinaSalary10 + " рублей. Годовой доход вырос на " + cristinaDiff + " рублей");
    }
}