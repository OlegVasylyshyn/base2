package week7.day2.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;

public class FileUtil {

    private FileUtil(){}

    public static void copyFile(String srcFile, String destFile) {
        try(
                FileInputStream is = new FileInputStream(srcFile);
                FileOutputStream os = new FileOutputStream(destFile)

                ) {

            int size = 1024;
            byte[] buff = new byte[size];
            int read = 0;

            while ((read = is.read(buff, 0, size)) != -1) {

                os.write(buff, 0, read);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile2(String srcFile, String destFile){

        Path src = Paths.get(srcFile);
        Path dst = Paths.get(destFile);

        try {
            Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
