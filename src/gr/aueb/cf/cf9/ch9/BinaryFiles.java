//package gr.aueb.cf.cf9.ch9;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class BinaryFiles {
//    public static void main(String[] args) {
//
//        String inputFile = "C:\\Users\\LENOVO\\Pictures\\Before-Sunrise.jpg";
//        String outputFile = "C:\\Users\\LENOVO\\Pictures\\Before-Sunrise-copy.jpg";
//
//
//    }
//
//    public static void binaryFileReaderWriter(String inputFile, String outputFile) {
//        final int BUFFER_SIZE = 8192;  // 8 kb
//        byte[] buffer = new byte[BUFFER_SIZE];
//        int byteRead = 0;
//
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
//             BufferedOutputStream bos = new BufferedInputStream(new FileOutputStream(outputFile))) {
//
//            while ((byteRead = bis.read(buffer)) != -1) {
//                bos.write(buffer, 0, byteRead);
//            }
//            System.out.println("File written successfully");
//
//        }
//    }
//
//}
