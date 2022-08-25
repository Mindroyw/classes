public class Book {
    private String bookName;
    private String author;
    private int yearOfPublication;

    public Book(String bookName, String Author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = Author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookName(){
        return this.bookName;
    }

    public String getAuthor(){
        return this.author;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}