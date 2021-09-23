package week3.java_collection_famework.list_student;

import java.util.*;

public class LinkedHashSetExample3 {
    public static void main(String[] args) {
//        Set<Student> students = new HashSet<>();
//        Student student1 = new Student(1, "Nam");
//        Student student2 = new Student(2, "An");
//        Student student3 = new Student(3, "Nguyen");
//        Student student4 = new Student(2,"Nam");
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
////        Iterator<Student> it = students.iterator();
////      //  students.remove(student2);
////        while (it.hasNext()) {
////            Student s = (Student) it.next();
////            System.out.println(s);
////        }
//        System.out.println(students.());
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        setA.add("Pass");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));

    }
}

