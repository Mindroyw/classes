public class Author {
    Author author = Author.createAuthor("Иан" ,"Флемминг");
    private String firstNameAuthor;
    private String surnameAuthor;

    public static Author createAuthor(String firstNameAuthor,String surnameAuthor) {
        Author author = new Author();
        author.firstNameAuthor = firstNameAuthor;
        author.surnameAuthor = surnameAuthor;
        return author;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

}
