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

    public String getAuthor() {
        return this.author.toString();
    }

    public String getPrice() {
        return this.price + "€";
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public String getSold() {
        return this.sold + " sold.";
    }

    public void setSold(int s) {
        this.sold = s;
    }

    public String toString() {
        return "Book[Name = " + this.name + ", " + this.author.toString() + ", Price = "
                + this.price + "€, Sold = " + this.sold + "]";
    }

}
