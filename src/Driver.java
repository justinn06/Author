import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        Author author1 = new Author("Justin", "123@gmail.com", 'f');
        System.out.println(author1.toString());
        System.out.println(author1.getName());
        author1.setEmail("isturin@gmail.com");
        System.out.println(author1.getEmail());

        Book book1 = new Book("Harry Potter", author1, 10.50, 3);
        System.out.println(book1.toString());

    }
}
