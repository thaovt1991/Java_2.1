package week4.io.io_exp;

import java.io.FileWriter;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Input url file : "); //
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
//        try{
//        FileWriter writer = new FileWriter(path);
//           writer.write(8);
//           writer.close();
//        }catch (Exception e){
//            System.out.println("Not number");
//        };

        FileText readFileExample = new FileText() ;
//
//        readFileExample.inputFile(path,5);

        readFileExample.testFileText(path);
    }
}
