package week4.io.copyfile;

import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("D:\\Java_2.1\\Modul02\\src\\week4\\io\\copyfile\\data\\file.txt") ;
        for(String e : list){
            readAndWriteFile.writeFile("D:\\Java_2.1\\Modul02\\src\\week4\\io\\copyfile\\data\\file_copy.txt", e );
        }
    }
}
