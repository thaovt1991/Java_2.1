package week4.io.io_exp;

import java.io.*;
import java.util.Scanner;

public class FileText {
    public void testFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            int sum = 0;
            while (line != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
                line = br.readLine();
            }
            br.close();
            System.out.println("Sum is : " + sum);
        } catch (Exception e) {
            System.out.println("The file not exist or error !");
        }
    }

//    public void inputFile(String filePath , int num){
//        try {
//            FileWriter file = new FileWriter(filePath);
//            file.write(num);
//            file.close();
//        } catch (Exception e) {
//            System.out.println("Num not int !");
//        }
//    }



}