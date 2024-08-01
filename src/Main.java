public class Main {
    public static void main(String[] args) {
//        Создаём студентов
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 100, 50, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 80, 50, 100, 100);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 60, 70, 10, 100, 50);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 60, 70, 100, 100, 50, 50, 50);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 60, 70, 100, 100, 50, 60, 40);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 70, 60, 50, 100, 50, 60, 10);
        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", 80, 60, 50, 30, 50);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 40, 60, 50, 100, 50);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 75, 60, 50, 90, 50);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 100, 100, 50, 90, 50, 45);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 60, 70, 50, 70, 50, 100);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 65, 50, 100, 70, 50, 100);

//        Распечатать студентов
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
//        Сравнения
        harryPotter.compareCurrentFacultyStudents(hermioneGranger);
        ronWeasley.compareCurrentFacultyStudents(padmaPatil);
        harryPotter.compareHogwartsStudents(marcusBelby);
        grahamMontague.compareHogwartsStudents(gregoryGoyle);
    }
}