package com.codegym;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.*;
public class Exp{
//    public static void main(String args[]){
//        LocalDate dateTemp ;
//        LocalDate date = LocalDate.of(2021,10,13);
//        dateTemp =  date.minusDays(1);
//        System.out.println(dateTemp);
//
//
//        }

//    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
//        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//    }
//
//    private static void copyFileUsingStream(File source, File dest) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
//            byte[] buffer = new byte[1024];
//            int length;
//            while ((length = is.read(buffer)) > 0) {
//                os.write(buffer, 0, length);
//            }
//        } finally {
//            is.close();
//            os.close();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.printf("Enter source file:");
//        String sourcePath = in.nextLine();
//        System.out.printf("Enter destination file:");
//        String destPath = in.nextLine();
//
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);
//
//        try {
//            copyFileUsingJava7Files(sourceFile, destFile);
//            //copyFileUsingStream(sourceFile, destFile);
//            System.out.printf("Copy completed");
//        } catch (IOException ioe) {
//            System.out.printf("Can't copy that file");
//            System.out.printf(ioe.getMessage());
//        }
//    }

    /**
     * main
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // sourceFolder: thu muc nguon duoc copy
        File sourceFolder = new File("E:\\data");
        // targetFolder: thu muc dich duoc copy den
        File targetFolder = new File("E:\\");
        // goi phuong thuc copy
        copyFolder(sourceFolder, targetFolder);
    }

    /**
     * copy folder
     *
     * @param sourceFolder
     * @param targetFolder
     * @throws IOException
     */
    private static void copyFolder(File sourceFolder, File targetFolder)
            throws IOException {
        // Check neu sourceFolder la mot thu muc hoac file
        // neu sourceFolder la file thi copy den thu muc dich
        if (sourceFolder.isDirectory()) {
            // Xac nhan neu targetFolder chua ton tai thi tao moi
            if (!targetFolder.exists()) {
                targetFolder.mkdir();
                System.out.println("Thu muc da duoc tao " + targetFolder);
            }
            // Liet ke tat ca cac file va thu muc trong sourceFolder
            String files[] = sourceFolder.list();
            for (String file : files) {
                File srcFile = new File(sourceFolder, file);
                File tarFile = new File(targetFolder, file);
                // goi lai phuong thuc copyFolder
                copyFolder(srcFile, tarFile);
            }
        } else {
            // copy file tu thuc muc nguon den thu muc dich
            Files.copy(sourceFolder.toPath(), targetFolder.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File da duoc copy " + targetFolder);
        }
    }

}

