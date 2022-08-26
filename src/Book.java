public class Book {
    String bookName;
    Author author;
    int yearOfPublication;

    public  Book(String bookName, Author author, int yearOfPublication) {

            this.bookName = bookName;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
        }
        Author authorFlemming = Author.createAuthor("Иан" ,"Флемминг");
        Author authorClancy = Author.createAuthor("Том", "Клэнси");

        public String getBookName(){
            return this.bookName;
        }
        public Author getAuthor(){
            return  this.author;

        }
        public int getYearOfPublication(){
                return this.yearOfPublication;
        }
        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        }