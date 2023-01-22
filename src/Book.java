public class Book {
    private final String title;
    private final Author authorName;
    private int publishingYear;

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()){
            return false;
        }
        
        Book c2 = (Book) obj;
        if (getPublishingYear() != c2.getPublishingYear()){
            return false;
        }
        if (getAuthorName() != c2.getAuthorName()){
            return false;
        }
        return title.equals(c2.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, authorName, publishingYear);
    }
    @Override
    public String toString() {
        return "Имя автора "+ authorName+ " Год издания "+ publishingYear;
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
