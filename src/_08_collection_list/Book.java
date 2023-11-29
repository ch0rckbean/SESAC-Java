package _08_collection_list;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titile='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}