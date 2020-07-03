package oefbooks;

public class Main {
    public static void main(String[] args) {
        Author anAuthor = new Author("JK Rowling", 'v', "jk@zweinstein.com");
        Book aBook = new Book("De klokkenluider", anAuthor, 12.50);
        System.out.println(aBook.toString());
    }
}
