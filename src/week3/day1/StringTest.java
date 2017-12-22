package week3.day1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String text = "Hello world";


        System.out.println(text.charAt(6));
        System.out.println(text.length());


        System.out.println(text + " hello");
        System.out.println(text.concat(" hello"));


        System.out.println(text.endsWith("world"));
        System.out.println(text.startsWith("world"));

        System.out.println(text.substring(6));
        System.out.println(text.substring(0, 5));

        String[] split = text.split(" ");
        System.out.println(Arrays.toString(split));


        System.out.println(text.contains("Oleg"));
        System.out.println(text.equals("DEX"));
        System.out.println(text.equals("Hello world"));
        System.out.println(text.equalsIgnoreCase("Hello World"));


        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());


        System.out.println("      DEX    ");
        System.out.println("      DEX    ".trim());


        char[] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars));


        byte[] bytes = text.getBytes();
        System.out.println(Arrays.toString(bytes));

        System.out.println('\u4242');

        String s1 = new String("DEX");
        String s2 = new String("DEX");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        String s3 = "DEX";
        String s4 = "DEX";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));


    }

}
