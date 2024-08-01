public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(
            String name,
            int magicPower,
            int transgressionDistance,
            int nobility,
            int honor,
            int bravery
    ) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
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
        };
        Gryffindor that = (Gryffindor) student;
        int currentSum = getNobility() + getHonor() + getBravery();
        int externalSum = that.getNobility() + that.getHonor() + that.getBravery();
        if (currentSum > externalSum) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + that.getName());
        } else if (externalSum > currentSum) {
            System.out.println(that.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println("Гриффиндорцы равны");
        }
    }
}
