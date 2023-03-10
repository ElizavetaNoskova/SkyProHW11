import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Author authorName1 = new Author("Толстой", "Лев");
        Book book1 = new Book("Война и Мир", authorName1, authorName1,  1865);
        System.out.println("Название книги " + book1.getTitle());
        System.out.println("Имя и фамилия автора книги " + book1.getAuthorName().getName() + " " + book1.getAuthorName().getSername());
        System.out.println("Год издания книги " + book1.getPublishingYear());
        book1.setPublishingYear(21);
        System.out.println("Год издания книги " + book1.getPublishingYear());
        Author authorName2 = new Author("Щерба", "Наталья");
        Book book2 = new Book("Часодеи", authorName2,authorName2, 2011);
        System.out.println("Название книги " + book2.getTitle());
        System.out.println("Имя и фамилия автора книги " + book2.getAuthorName().getName() + " " + book2.getAuthorName().getSername());
        System.out.println("Год издания книги " + book2.getPublishingYear());
        book2.setPublishingYear(89);
        System.out.println("Год издания книги " + book2.getPublishingYear());
        Author authorName3 = new Author("Елисеева", "Алла");
        System.out.println(new Book("Fox", authorName3, authorName3,  1965));
        Book book5 = new Book("Война и Мир", authorName1, authorName1,  1865);
        Book book6 = new Book("Война и Мир", authorName1, authorName1, 1865);

        System.out.println(book5.equals(book6));
        System.out.println(book5.hashCode());
        System.out.println(book6.hashCode());
        System.out.println(book2.hashCode());
    }


}