public class Homework {
    public static void main(String[] args) {

        Book book = new Book("Stephen King", 100, "Book Publishing Ltd.", 2015);
        System.out.println(book.getAuthorName() + ", " + book.getPageAmount() + " страниц, издательство "
                + book.getPublisherName() + ", " + book.getPublishingYear() + " год издания");
        book.setPublishingYear(2022);
        System.out.println(book.getAuthorName() + ", " + book.getPageAmount() + " страниц, издательство "
                + book.getPublisherName() + ", " + book.getPublishingYear() + " год издания");
    }
}