public class Book {
    private String name;
    private Author[] authors;
    double price;
    int sold;

    public Book(String n, Author[] a, double p, int s) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.sold = s;
    }

    public Author[] getAuthorArray(){
        return this.authors;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor(int x) {
        return getAuthorArray()[x];
    }

    public String getAuthorNames(){
    String Names = "";

    for (int i = 0; i < getAuthorArray().length; i++)
        Names = Names + getAuthor(i).getName() + "\n";

    return Names;
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


    public String toString() {
        return "Book[Name = " + getName() + ", " + getAuthorNames() + ", Price = "
                + getPrice() + ", Sold = " + getSold() + "]";
    }

}
