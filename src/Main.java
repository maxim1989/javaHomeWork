public class Main {
    public static void main(String[] args) {
        Author tomMorgan = new Author("Tom", "Morgan");
        Author johnSmith = new Author("John", "Smith");
        Book morganBook = new Book("Wild nature", tomMorgan, 2000);
        Book smithBook = new Book("My memories", johnSmith, 2014);
        smithBook.setYear(2015);
        System.out.println("tomMorgan.toString: " + tomMorgan.toString());
        System.out.println("morganBook.toString: " + morganBook.toString());
        System.out.println("johnSmith.toString: " + johnSmith.toString());
        System.out.println("smithBook.toString: " + smithBook.toString());
        System.out.println("tomMorgan == tomMorgan: " + tomMorgan.equals(tomMorgan));
        System.out.println("johnSmith == johnSmith: " + johnSmith.equals(johnSmith));
        System.out.println("tomMorgan == johnSmith: " + tomMorgan.equals(johnSmith));
        System.out.println("johnSmith == tomMorgan: " + johnSmith.equals(tomMorgan));
        System.out.println("morganBook == morganBook: " + morganBook.equals(morganBook));
        System.out.println("smithBook == smithBook: " + smithBook.equals(smithBook));
        System.out.println("morganBook == smithBook: " + morganBook.equals(smithBook));
        System.out.println("smithBook == morganBook: " + smithBook.equals(morganBook));
        System.out.println("morganBook hashCode " + morganBook.hashCode());
        System.out.println("smithBook hashCode " + smithBook.hashCode());
        System.out.println("tomMorgan hashCode " + tomMorgan.hashCode());
        System.out.println("johnSmith hashCode " + johnSmith.hashCode());
    }
}