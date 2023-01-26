public class Book {
    private String name;
    private Author author;
    private Author[] authors;
    double price;
    int sold;

    /*public Book(String n, Author a, double p, int s) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.sold = s;
    }*/
    public Book(String n, Author[] a, double p, int s) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.sold = s;
    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor(int x) {
        int i = x;
        return this.authors[i];
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

    public String getAuthorName(int x) {
        int i = x;
        return getAuthor(i).getName();
    }
    public String getAuthorEmail(int x) {
        int i = x;
        return getAuthor(i).getEmail();
    }
    public String getAuthorGender(int x) {
        int i = x;
        return getAuthor(i).getGender();
    }

    public String toString() {
        return "Book[Name = " + getName() + ", " + getAuthor(0).toString() + ", Price = "
                + getPrice() + ", Sold = " + getSold() + "]";
    }

}
