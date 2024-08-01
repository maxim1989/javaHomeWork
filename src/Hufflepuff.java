public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(
            String name,
            int magicPower,
            int transgressionDistance,
            int industriousness,
            int loyalty,
            int honesty
    ) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
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
        Hufflepuff that = (Hufflepuff) student;
        int currentSum = getHonesty() + getIndustriousness() + getLoyalty();
        int externalSum = that.getHonesty() + that.getIndustriousness() + that.getLoyalty();
        if (currentSum > externalSum) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + that.getName());
        } else if (externalSum > currentSum) {
            System.out.println(that.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println("Пуффендуйцы равны");
        }
    }
}
