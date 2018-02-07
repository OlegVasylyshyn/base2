package week7.day2.io.file;

import java.io.File;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {


        File file = new File("/home/dexter/Java/projects/base2/our.book");
        System.out.println(file.exists());

        System.out.println(file.isDirectory());

        System.out.println(file.getPath());


        FileUtil.copyFile2("twitter.html", "newTwitter.html");

    }

}
