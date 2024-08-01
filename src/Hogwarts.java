import java.util.Objects;

public class Hogwarts {
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compareHogwartsStudents(Object student) {
        if (this == student) {
            System.out.println("Сравнение с самим собой");
            return;
        }
        if (!(student instanceof Hogwarts hogwarts)) {
            System.out.println("Сравнение с другим объектом");
            return;
        }

        int currentMagicPower = getMagicPower();
        int externalMagicPower = hogwarts.getMagicPower();
        if (currentMagicPower > externalMagicPower) {
            System.out.println(getName() + " обладает большей мощностью магии, чем " + hogwarts.getName());
        } else if (currentMagicPower < externalMagicPower) {
            System.out.println(hogwarts.getName() + " обладает большей мощностью магии, чем " + getName());
        } else {
            System.out.println(hogwarts.getName() + " обладает такой же мощностью магии, как " + getName());
        }

        int currentTransgressionDistance = getTransgressionDistance();
        int externalTransgressionDistance = hogwarts.getTransgressionDistance();
        if (currentTransgressionDistance > externalTransgressionDistance) {
            System.out.println(getName() + " обладает большим расстоянием трансгрессии, чем " + hogwarts.getName());
        } else if (currentTransgressionDistance < externalTransgressionDistance) {
            System.out.println(hogwarts.getName() + " обладает большим расстоянием трансгрессии, чем " + getName());
        } else {
            System.out.println(hogwarts.getName() + " обладает таким же расстоянием трансгрессии, как " + getName());
        }
    }
}
