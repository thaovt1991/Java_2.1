package week4.io_byrari_seri.exp_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(students);
            os.close();
            fos.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public  static  List<Student>  readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream oos = new ObjectInputStream(fis);
            students = (List<Student>) oos.readObject();
            fis.close();
            oos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        students.add(new Student(6, "Nguyễn Khắc Tan", "Hà Nội"));
        students.add(new Student(7, "Nguyễn Khắc Binh", "Hà Nội"));
        String linkFile = "D:\\Java_2.1\\Modul02\\src\\week4\\io_byrari_seri\\exp_student\\data\\student.txt";



        writeToFile(linkFile, students);
        List<Student> studentDataFromFile = readDataFromFile(linkFile);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
