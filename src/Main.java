public class Main {
    public static String codeSeparator() {
        System.out.println("---------------------------");
        return null;
    }

    public static void main(String[] args) {

        codeSeparator();

        Book goldfinger = new Book("Голдфингер",
                Author.createAuthor("Иан", "Флемминг"), 2017);
        System.out.println("Название книги: " + goldfinger.bookName + "; ");
        System.out.println("Автор книги: " + Author.createAuthor("Иан", "Флемминг"));
        System.out.println("Год публикации: " + goldfinger.yearOfPublication);

        codeSeparator();

        Book rainbowSix = new Book("Радуга Шесть",
                Author.createAuthor("Том", "Клэнси"), 2011);
        System.out.println("Название книги: " + rainbowSix.bookName);
        System.out.println("Автор книги: " + rainbowSix.author);
        rainbowSix.setYearOfPublication(2015);
        System.out.println("Год публикации: " + rainbowSix.yearOfPublication);

        codeSeparator();
    }
}
