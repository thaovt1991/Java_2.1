package week4.io_byrari_seri.copy_fileBinary;

import week4.io_byrari_seri.ex_product_manager.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<Object> readFile(String path){
        List <Object> obj = new ArrayList<>() ;
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (List<Object>)ois.readObject() ;
            ois.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj ;
    }
    public void writeFile(String path, List obj){
        ObjectOutputStream writer = null ;
        try{
            FileOutputStream  fos = new FileOutputStream(path);
            writer = new ObjectOutputStream(fos);
            writer.writeObject(obj);
            writer.close();
            fos.close();
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
         String linkcop = "D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\ex_product_manager\\data\\product.txt";
         String linkParse = "D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\copy_fileBinary\\data\\product_copy.txt";
//    try {
        List list= new ArrayList();
      copyFile.writeFile(linkParse,list);
        System.out.println("Suscess");
//     }catch (Exception e){
//        System.out.println("File not exist !");
//     }catch (IOException e){
//        e.getStackTrace();
    }
}
