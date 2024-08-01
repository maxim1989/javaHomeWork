public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(
            String name,
            int magicPower,
            int transgressionDistance,
            int trick,
            int determination,
            int ambition,
            int resourcefulness,
            int thirstPower
    ) {
        super(name, magicPower, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
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
        Slytherin that = (Slytherin) student;
        int currentSum = getTrick() + getDetermination() + getAmbition() + getResourcefulness() + getThirstPower();
        int externalSum = that.getTrick() + that.getDetermination() + that.getAmbition() + that.getResourcefulness() + that.getThirstPower();
        if (currentSum > externalSum) {
            System.out.println(getName() + " лучший Слизеринин, чем " + that.getName());
        } else if (externalSum > currentSum) {
            System.out.println(that.getName() + " лучший Слизеринин, чем " + getName());
        } else {
            System.out.println("Слизерине равны");
        }
    }
}
