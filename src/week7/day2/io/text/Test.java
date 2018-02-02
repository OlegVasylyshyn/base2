package week7.day2.io.text;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

//        TextFilesUtil.writeTextFile4(Arrays.asList("DEX", "JAMES", "JASON"));

        String s = TextFilesUtil.readTextFile2("twitter.html");

        System.out.println(s);

    }

}
