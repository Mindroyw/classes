
public class Main {

    public static void main(String[] args) {

        Author firstAuthor = new Author("Иан","Флемминг");
        Author secondAuthor = new Author("Том","Клэнси");

        Book book1 = new Book("Голдфингер", new Author("Иан","Флемминг"), 1964);
        Book book2 = new Book("Красный шторм", new Author("Том","Клэнси"), 2016);

        Book book3 = new Book("Доктор Ноу", firstAuthor, 1962);
        Book book4 = new Book("Радуга шесть", secondAuthor, 2017);

        book1.bookInfo();
        book2.bookInfo();
        book3.bookInfo();
        book4.bookInfo();

        book2.setYearOfPublication(2019);
        book2.bookInfo();
    }
}
