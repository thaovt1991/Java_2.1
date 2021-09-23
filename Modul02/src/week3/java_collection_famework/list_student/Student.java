package week3.java_collection_famework.list_student;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}
