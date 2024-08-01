public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(
            String name,
            int magicPower,
            int transgressionDistance,
            int mind,
            int wisdom,
            int wit,
            int creativity
    ) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void compareCurrentFacultyStudents(Object student) {
        if (this == student) {
            System.out.println("Сравнение с самим собой");
            return;
        }
        if (student == null || getClass() != student.getClass()) {
            System.out.println("Сравнение с другим факультетом");
            return;
        }
        ;
        Ravenclaw that = (Ravenclaw) student;
        int currentSum = getMind() + getWisdom() + getWit() + getCreativity();
        int externalSum = that.getMind() + that.getWisdom() + that.getWit() + that.getCreativity();
        if (currentSum > externalSum) {
            System.out.println(getName() + " лучший Когтевранин, чем " + that.getName());
        } else if (externalSum > currentSum) {
            System.out.println(that.getName() + " лучший Когтевранин, чем " + getName());
        } else {
            System.out.println("Когтевране равны");
        }
    }
}
