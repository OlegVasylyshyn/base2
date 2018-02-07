package week7.day2.io.url;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlTest {

    public static void main(String[] args) throws URISyntaxException, IOException {


        URI uri = new URI("https://github.com/");
        URLConnection conn = uri.toURL().openConnection();


        InputStream is = conn.getInputStream();
//        FileOutputStream os = new FileOutputStream("img.png");
        Scanner scanner = new Scanner(is);

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }

        Pattern pattern = Pattern.compile("(http|https|ftp)://\\S*?\\.(png|jpg)");
        Matcher matcher = pattern.matcher(sb.toString());

        while (matcher.find()) {
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
            String picUrl = matcher.group();
            System.out.println(picUrl);
        }

//        int size = 1024;
//        byte[] buff = new byte[size];
//        int read = 0;
//
//        while ((read = is.read(buff, 0, size)) != -1) {
//
//            os.write(buff, 0, read);
//
//        }


    }

}
