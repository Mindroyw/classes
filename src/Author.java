public class Author {
    private String firstNameAuthor;
    private String surnameAuthor;

    public Author createAuthor(String firstNameAuthor, String surnameAuthor) {
        Author author = new Author();
        author.firstNameAuthor = firstNameAuthor;
        author.surnameAuthor = surnameAuthor;
        return author;
    }
    public String toString() {
        return "" + this.firstNameAuthor + "" + this.surnameAuthor;
    }
}
