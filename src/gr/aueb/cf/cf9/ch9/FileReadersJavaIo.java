package gr.aueb.cf.cf9.ch9;

import java.io.*;

/**
 * Demo of file readers in the java.io.package
 */
public class FileReadersJavaIo {

    public static void main(String[] args) {


    }

    //Scanner is useful for primitive types and strings

    public static void fileReader(String file) throws IOException {
        try (FileReader fr = new FileReader(file)) {
            int bytesRead = 0;

            while ((bytesRead = fr.read()) != -1) {  // while not EDF
                System.out.println((char) bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedReader(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {  // while not EOF
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


}
