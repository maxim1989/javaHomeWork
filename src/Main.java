public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);
        // Task 2
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);
        // Task 3
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        paper = paper - 7639;
        System.out.println("paper = " + paper);
        // Task 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        // Task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        // Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var commonWeight = boxer1 + boxer2;
        System.out.println("commonWeight = " + commonWeight);
        var diffWeight = boxer2 - boxer1;
        System.out.println("diffWeight = " + diffWeight);
        // Task 7
        var remainder = boxer2 % boxer1;
        System.out.println("remainder = " + remainder);
        // Task 8
        var hours = 640;
        var workHours = 8;
        var workers = hours / workHours;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var moreWorkers = workers + 94;
        var moreHours = moreWorkers * workHours;
        System.out.println("Если в компании работает " + moreWorkers + " человек, то всего " + moreHours + " часов работы может быть поделено между сотрудниками");
    }
}