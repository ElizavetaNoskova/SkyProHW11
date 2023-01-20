public class Book {
    private String title;
    private Author authorName;
    private int publishingYear;

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public Book(String title, Author authorName, int publishingYear) {
        this.title = title;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
}
