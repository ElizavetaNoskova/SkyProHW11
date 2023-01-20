public class Author {
    private String authorName;

    public String getName() {
        return authorName;
    }

    public Author(String authorName) {
        this.authorName = authorName.toString();
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

