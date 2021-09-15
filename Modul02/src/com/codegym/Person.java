package com.codegym;

public class Person {
    private String fullname ;
    private int age ;
    public static int dob ;

    public Person(){};

    public Person( String fullname, int age){
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
