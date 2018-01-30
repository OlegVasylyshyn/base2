package week7.day1;

import java.io.FileInputStream;
import java.io.InputStream;

public class FinallyTest {

    public static void main(String[] args) {


        try(InputStream is = new FileInputStream("")) {

            String s = "wer";
            if("wer".equals(s))
            throw new NullPointerException("ERROR");
            System.out.println("after exception");

        } catch (Throwable t) {
            System.out.println("catch");
        } finally {
            System.out.println("FINALLY");
        }


    }

}
