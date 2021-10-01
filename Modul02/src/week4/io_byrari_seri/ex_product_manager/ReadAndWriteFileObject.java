package week4.io_byrari_seri.ex_product_manager;

import week4.io_byrari_seri.exp_student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileObject {
    public static void writeFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }



    public static List<Product> readToFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product p1 = new Product(1, "Iphone 7", "Iphone", 7000000, "Bo nho: 64G ,");
        Product p2 = new Product(2, "Iphone 8", "Iphone", 11000000, "Bo nho:64G ,");
        Product p3 = new Product(3, "Iphone 10", "Iphone", 15000000, "Bo nho:128G ,");
        Product p4 = new Product(4, "Galaxy A50s", "SamSung", 35000000, "Bo nho:128G ,");
        Product p5 = new Product(5, "OPPO A5s.", "Oppo", 15000000, "Bo nho:128G ,");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        String linkFileSave = "D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\ex_product_manager\\data\\product.txt";
        writeFile(linkFileSave,products);

        List<Product> listProduct = readToFile(linkFileSave) ;
        for(Product p : listProduct){
            System.out.println(p);
        }
    }
}
