public class Main {
    public static void main(String[] args) {
        // Task 1
        byte age = 17;
        // byte age = 18;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний\n", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать\n", age);
        }
        // Task 2
        // byte temperature = -5;
        // byte temperature = 5;
        byte temperature = 10;
        if (temperature > 5) {
            System.out.printf("На улице %d градусов, можно идти без шапки\n", temperature);
        } else {
            System.out.printf("На улице %d градусов, нужно надеть шапку\n", temperature);
        }
        // Task 3
        // byte speed = 60;
        byte speed = 61;
        if (speed > 60) {
            System.out.printf("Если скорость %d, то придется заплатить штраф\n", speed);
        } else {
            System.out.printf("Если скорость %d, то можно ездить спокойно\n", speed);
        }
        // Task 4
        // byte humanAge = 3;
        // byte humanAge = 7;
        // byte humanAge = 24;
        byte humanAge = 30;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад\n", humanAge);
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", humanAge);
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.printf("Если возраст человека равен %d, то его место в университете\n", humanAge);
        } else if (humanAge > 24) {
            System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу\n", humanAge);
        }
        // Task 5
        // byte childAge = 4;
        // byte childAge = 6;
        byte childAge = 14;
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе\n", childAge);
        } else if (childAge >= 5 && childAge < 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении\n", childAge);
        } else {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого\n", childAge);
        }
        // Task 6
        byte wagonCapacity = 102;
        byte seats = 60;
        int standingPlaces = wagonCapacity - seats;
//        byte seatsOccupied = 10;
//        byte standingPlacesOccupied = 10;
//        byte seatsOccupied = 60;
//        byte standingPlacesOccupied = 10;
//        byte seatsOccupied = 59;
//        byte standingPlacesOccupied = 42;
        byte seatsOccupied = 60;
        byte standingPlacesOccupied = 42;
        if (seatsOccupied < seats && standingPlacesOccupied < standingPlaces) {
            System.out.printf("В вагоне есть места, %d сидячих и %d стоячих\n", seats - seatsOccupied, standingPlaces - standingPlacesOccupied);
        } else if (seatsOccupied >= seats && standingPlacesOccupied < standingPlaces) {
            System.out.printf("В вагоне есть места, %d стоячих\n", standingPlaces - standingPlacesOccupied);
        } else if (seatsOccupied < seats && standingPlacesOccupied >= standingPlaces) {
            System.out.printf("В вагоне есть места, %d сидячих\n", seats - seatsOccupied);
        } else {
            System.out.println("В вагоне нет мест");
        }
        // Task 7
//        int one = 3;
//        int two = 2;
//        int three = 1;
//        int one = 2;
//        int two = 3;
//        int three = 1;
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.printf("Число one, равное %d, является наибольшим", one);
        } else if (two >= one && two >= three) {
            System.out.printf("Число two, равное %d, является наибольшим", two);
        } else {
            System.out.printf("Число three, равное %d, является наибольшим", three);
        }
    }
}