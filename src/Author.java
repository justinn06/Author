public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        if (this.gender == 'f')
            return "Female.";
        else if (this.gender == 'm')
            return "Male.";
        else
            return "Other.";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String toString() {
        return "Author[Name = " + this.name + ", Email = " + this.email + ", Gender = " + this.gender + "]";
    }

}
