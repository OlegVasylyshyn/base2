package week7.day2.io.text;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class TextFilesUtil {

    private TextFilesUtil(){}


    public static void writeTextFile(String text){

        try(
                PrintWriter writer = new PrintWriter("printWriter.txt")
        ) {

            writer.write(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeTextFile2(String text) {

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("bufferedWriter.txt")) ){

            writer.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeTextFile3(String text) {

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("bufferedWriter.txt")) ){

            char[] chars = text.toCharArray();
            writer.write(chars, 0, 5);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeTextFile4(List<String> lines) {

        try {
            Path path = Paths.get("path.txt");
            Files.write(path, lines, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readTextFile(String fileName){

        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {

            StringBuilder sb = new StringBuilder();

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }

            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String readTextFile2(String fileName) {

        try(
                BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {

            StringBuilder sb = new StringBuilder(100000);

            int bufferSize = 1024;
            char[] buff = new char[bufferSize];
            int read = 0;
            while ((read = reader.read(buff, 0, bufferSize)) != -1 ) {

                System.out.println("Was read - " + read);
                sb.append(buff);
                buff = new char[bufferSize];
            }

            return sb.toString();

        } catch (IOException e){
            e.printStackTrace();
        }
        return "";
    }

}
