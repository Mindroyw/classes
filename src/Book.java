import java.util.Objects;
public class Book {
    private final String title;
    private final Author authorFullName;
    private int yearOfPublication;

    public Book(String title, Author authorFullName, int yearOfPublication) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication >= 0) {
            this.yearOfPublication = yearOfPublication;
        } else {
            System.out.println("Неверные данные!");
        }
    }

    public void bookInfo(){
        System.out.printf("Название: %s\nАвтор: %s\nГод публикации: %s\n", title, authorFullName.getAuthorFullName(), yearOfPublication);
        System.out.println("========================");
    }
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + authorFullName +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    public int hashCode() {
        return Objects.hash(title);
    }
}

/**
 ───▐▀▄──────▄▀▌───▄▄▄▄▄▄▄
 ───▌▒▒▀▄▄▄▄▀▒▒▐▄▀▀▒██▒██▒▀▀▄
 ──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄
 ──▌▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄
 ▀█▒▒█▌▒▒█▒▒▐█▒▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌
 ▀▌▒▒▒▒▒▀▒▀▒▒▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐ ▄▄
 ▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄█▒█
 ▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▀
 ──▐▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▌
 ────▀▄▄▀▀▀▀▄▄▀▀▀▀▀▀▄▄▀▀▀▀▀▀▄▄
 */