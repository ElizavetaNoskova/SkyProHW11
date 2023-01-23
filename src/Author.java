import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSername;

    public String getSername() {
        return authorSername;
    }

    public Author(String authorSername, String authorName) {
        this.authorSername = authorSername.toString();
        this.authorName = authorName.toString();
    }

    public String getName() {
        return authorName;
    }

    @Override
    public String toString() {
        return  authorName + " " + authorSername;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSername);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSername.equals(author.authorSername);
    }

    @Override
    public String toString() {
        return authorName;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


