public class Main {
    public static void main(String[] args) {
        Author tomMorgan = new Author("Tom", "Morgan");
        Author johnSmith = new Author("John", "Smith");
        Book morganBook = new Book("Wild nature", tomMorgan, 2000);
        Book smithBook = new Book("My memories", johnSmith, 2014);
        smithBook.setYear(2015);
        System.out.println("morganBook name: " + morganBook.getName());
        System.out.println("morganBook year: " + morganBook.getYear());
        System.out.println("morganBook author name: " + morganBook.getAuthor().getName());
        System.out.println("morganBook author surname: " + morganBook.getAuthor().getSurname());
        System.out.println("smithBook name: " + smithBook.getName());
        System.out.println("smithBook year: " + smithBook.getYear());
        System.out.println("smithBook author name: " + smithBook.getAuthor().getName());
        System.out.println("smithBook author surname: " + smithBook.getAuthor().getSurname());
    }
}