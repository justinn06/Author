import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        Author author1 = new Author("JK Rowling", "123@gmail.com", 'f');
        author1.setEmail("rowling@gmail.com");
        System.out.println(author1.toString());

        Author author2 = new Author("Steinbeck", "steinbeck@gmail.com", 'm');
        System.out.println(author2.toString());

        Author[] author3 = new Author[3];
        author3[0] = new Author("Roal Dahl", "dahl@gmail.com", 'm');
        author3[1] = new Author("Michelle Obama", "michelleobama@gmail.com", 'f');
        author3[2] = new Author("Carol Ann Duffy", "annduffy@gmail.com", 'f');

        Book book1 = new Book("Harry Potter", author1, 10.50, 0);
        book1.setSold(100);
        System.out.println(book1.toString());

        Book book2 = new Book("Of Mice and Men", author2, 9.00, 150);
        System.out.println(book2.toString());

        Book book3 = new Book("Book3", author3, 11.50, 200);

        System.out.println(book3.getAuthors(0));
        System.out.println(book3.getAuthorsName(1));
        System.out.println(book3.getAuthorEmail(2));
        System.out.println(book3.getAuthorGender(0));

    }
}
