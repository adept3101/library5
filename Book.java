public final class Book {
    private final String title;
    private final int publishYear;
    private final String author;

    private Book(Builder builder) {
        this.title = builder.title;
        this.publishYear = builder.publishYear;
        this.author = builder.author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }

    public String toString() {
        return "Название " + title + ", год выпуска " + publishYear + ", автор " + author;
    }

    public static class Builder {
        private String title;
        private int publishYear;
        private String author;

        public Builder(String title, int publishYear, String author) {
            this.title = title;
            this.publishYear = publishYear;
            this.author = author;
        }

        public Builder setTitle (String title) {
            this.title = title;
            return this;
        }

        public Builder setPublishYear(int year) {
            this.publishYear = year;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
