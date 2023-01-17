public class Main {
    public static void main(String[] args) {
        Author authorName1 = new Author("Лев Толстой");
        Book book1 = new Book("Война и Мир",authorName1, 1865);
        System.out.println("Название книги " + book1.getTitle());
        System.out.println("Имя автора книги " + book1.getAuthorName().getName());
        System.out.println("Год издания книги " + book1.getPublishingYear());
        book1.setPublishingYear(21);
        System.out.println("Год издания книги " + book1.getPublishingYear());
        Author authorName2 = new Author("Наталья Щерба");
        Book book2 = new Book("Часодеи",authorName2, 2011);
        System.out.println("Название книги " + book2.getTitle());
        System.out.println("Имя автора книги " + book2.getAuthorName().getName());
        System.out.println("Год издания книги " + book2.getPublishingYear());
        book2.setPublishingYear(89);
        System.out.println("Год издания книги " + book2.getPublishingYear());
    }


}