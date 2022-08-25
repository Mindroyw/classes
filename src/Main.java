public class Main {
    public static String codeSeparator(){
        System.out.println("---------------------------");
        return null;
    }

    public static void main(String[] args) {

        codeSeparator();

        Book book = new Book("Голдфингер", "Иан Флемминг", 2017);
        System.out.println("Название книги: " + book.getBookName());
        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Год публикации: " + book.getYearOfPublication());

        codeSeparator();

        Book book1 = new Book("Радуга Шесть","Том Клэнси", 2011);
        System.out.println("Название книги: " + book1.getBookName());
        System.out.println("Автор книги: " + book1.getAuthor());
        book1.setYearOfPublication(2016);
        System.out.println("Год публикации: " + book1.getYearOfPublication());

        codeSeparator();

    }

}