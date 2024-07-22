public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        Book[] books = new Book[3];

        people[0] = new Person("Gabriel", 24, "male");
        people[1] = new Person("Milena", 24, "female");
        books[0] = new Book("Ready player one", "E. Cline", 150, people[0]);
        books[1] = new Book("Data Structures and algorithms", "Unknown", 150, people[0]);
        books[2] = new Book("A Cabana", "Unknown", 150, people[1]);

        books[0].open();
        books[0].flipPages(100);

        for (Book book: books) {
            System.out.println(book.details());
            System.out.println("===================");
        }
    }
}