package week7.day2.io.serialize;

import java.util.Arrays;

public class SerializeTest {

    public static void main(String[] args) {

        Book book = new Book();
        book.setName("JAVA");
        book.setPages(200);

        SerializeUtil.persistBook(book, book, book);

        Book[] books = SerializeUtil.readBook();
        System.out.println(Arrays.toString(books));

    }


}
