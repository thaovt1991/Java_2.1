package week4.io_byrari_seri.exp_Birary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

////        System.out.printf("Enter source file:");
////        String sourcePath = in.nextLine();
////        System.out.printf("Enter destination file:");
////        String destPath = in.nextLine();
//
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);

        File sourceFile = new File("D:\\Java_2.1\\Modul02\\src\\week4\\io\\read_csv\\data\\contries.csv");
        try {
            File destFile = new File("D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\exp_Birary\\data\\file_colpy.csv");
             if (!destFile.exists()) {
                FileWriter writer = new FileWriter("D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\exp_Birary\\data\\file_copy.csv");
            // writer.flush();
             writer.close();
             }
        }catch (Exception e){
            e.getStackTrace() ;
        }

        File destFile = new File("D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\exp_Birary\\data\\file_copy.csv");

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
