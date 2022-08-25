public class main {
    public static String codeSeparator(){
        System.out.println("---------------------------");
        return null;
    }

    public static void main(String[] args) {

        codeSeparator();

        Book book = new Book("Голдфингер", "Иан Флемминг", 2017);
        System.out.println("Название книги: " + book.bookName);
        System.out.println("Автор книги: " + book.author);
        System.out.println("Год публикации: " + book.yearOfPublication);

        codeSeparator();

        Book book1 = new Book("Радуга Шесть","Том Клэнси", 2011);
        System.out.println("Название книги: " + book1.bookName);
        System.out.println("Автор книги: " + book1.author);
        book1.setYearOfPublication(2016);
        System.out.println("Год публикации: " + book1.yearOfPublication);

        codeSeparator();

    }

}