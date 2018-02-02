package week7.day2.io.serialize;

import java.io.*;

public class SerializeUtil {

    private SerializeUtil(){}


    public static void persistBook(Book... book){

        try (
                FileOutputStream fis = new FileOutputStream("our.book");
                ObjectOutputStream oos = new ObjectOutputStream(fis)
        ) {

            oos.writeObject(book);

            System.out.println("Boo was successfully persisted");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Book[] readBook() {

        try(
                FileInputStream fis = new FileInputStream("our.book");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {

            return  (Book[]) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
