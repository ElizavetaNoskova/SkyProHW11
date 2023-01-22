public class Book {
    private final String title;
    private final Author authorName;
    private final Author authorSername;
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
        if (getAuthorSername() != c2.getAuthorSername()) {
            return false;
        }
        return title.equals(c2.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, authorName, authorSername, publishingYear);
    }
    @Override
    public String toString() {
        return "Имя автора и фамилия "+ authorName +" " + "Название книги " + title + " Год издания "+ publishingYear ;
    }



    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return authorName;
    }
    public Author getAuthorSername() {
        return authorSername;
    }

    public Book(String title, Author authorName,Author authorSername, int publishingYear) {
        this.title = title;
        this.authorName = authorName;
        this.authorSername = authorSername;
        this.publishingYear = publishingYear;
    }
}
