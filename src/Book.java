public class Book {
    private String name;
    private Author author;
    double price;
    int sold;

    public Book(String n, Author a, double p, int s) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.sold = s;
    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getPrice() {
        return this.price + "€";
    }
    public void setPrice(double p) {
        this.price = p;
    }
    public int getSold() {
        return this.sold;
    }
    public void setSold(int s) {
        this.sold = s;
    }

    /* Introduce new methods called: getAuthorName(), getAuthorEmail(), getAuthorGender()
    in the book class to return the name, email, and gender of the author of the book. */

    public String getAuthorName() {
        return getAuthor().getName();
    }
    public String getAuthorEmail() {
        return getAuthor().getEmail();
    }
    public String getAuthorGender() {
        return getAuthor().getGender();
    }

    public String toString() {
        return "Book[Name = " + getName() + ", " + getAuthor().toString() + ", Price = "
                + getPrice() + ", Sold = " + getSold() + "]";
    }

}
