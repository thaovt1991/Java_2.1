package com.codegym;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        Person person1 = new Person("a",8);
//        person.setFullname("b");
//        person.setAge(9);
//        System.out.println(person.toString());
//        System.out.println(person1.toString());
//        Person.dob = 2000;
        MyClass o = new MyClass();
        MyClass.method();
        MyClass.X = 10;
        MyClass o2 = new MyClass();
        o2.X= 20;
        System.out.printf("x=%d, y=%d", o.X, MyClass.X);
    }
}




