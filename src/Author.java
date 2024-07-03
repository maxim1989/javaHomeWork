import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return getName() + " " + getSurname();
    }

    public boolean equals(Author author) {
        return Objects.equals(
                this.getName(),
                author.getName()
        ) && Objects.equals(
                this.getSurname(),
                author.getSurname()
        );
    }

    public int hashCode() {
        final char[] array = toString().toCharArray();
        int counter = 0;
        for (int c : array) {
            counter += c;
        }
        return counter;
    }
}
