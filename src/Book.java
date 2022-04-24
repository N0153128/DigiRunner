import java.time.Year;

public class Book {
    private final String isbn;
    private final String title;
    private final int genre;
    private final String author;
    private final Year published;
    private final String description;
    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.published = builder.published;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private final String isbn;
        private final String title;
        private int genre;
        private String author;
        private Year published;
        private String description;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder genre(int genre) {
            this.genre = genre;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder published(Year published) {
            this.published = published;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }
    public static void main (String[] args) {
    Book book = new Book.Builder("0-12-345678-9", "Moby-Dick")
                .genre(1)
                .author("Herman Melville")
                .published(Year.of(1851))
                .description(
                        "The book is the sailor Ishmael's narrative of the obsessive quest of "
                        + "Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, "
                        + "the giant white sperm whale that on the ship's previous voyage bit "
                        + "off Ahab's leg at the knee."
                )
                .build();
    System.out.println(book);

    }    

}


