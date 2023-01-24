import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        Author author1 = new Author("JK Rowling", "123@gmail.com", 'f');
        //System.out.println(author1.getName());
        //System.out.println(author1.getEmail());
        author1.setEmail("rowling@gmail.com");
        System.out.println(author1.toString());


        Author author2 = new Author("Steinbeck", "steinbeck@gmail.com", 'm');
        System.out.println(author2.toString());

        Book book1 = new Book("Harry Potter", author1, 10.50, 0);
        book1.setSold(100);
        System.out.println(book1.toString());

        Book book2 = new Book("Of Mice and Men", author2, 9.00, 150);
        System.out.println(book2.toString());

    }
}
