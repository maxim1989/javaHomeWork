public class Book {
    private String name;
    private Author author;
    private int year;
    private int instanceCounter = 0;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        incrementInstanceCounter();
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return getAuthor() + ": " + getName() + ", " + getYear();
    }

    public boolean equals(Book book) {
        return this.toString().equals(book.toString());
    }

    public int hashCode() {
        return getInstanceCounter() + getYear();
    }

    public int getInstanceCounter() {
        return instanceCounter ;
    }

    private void incrementInstanceCounter() {
        this.instanceCounter += 1;
    }
}
