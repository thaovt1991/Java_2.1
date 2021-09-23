package week3.java_collection_famework.student;

import java.util.* ;

public class TestMap {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Student student4 = new Student("Long" , 24,"Hue") ;
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(2,student1);
        studentMap.put(5,student4);


        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(studentMap.keySet());
        // tra ve gia tri tu tren xuonsg va thay the gia trij cuoi cung vao key trung lap

        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students.add(student4);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
