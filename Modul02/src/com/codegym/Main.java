package com.codegym;

public class Main {

    public int rong, dai;

    public Main(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}

class MyClass {
    void method(Main x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        Main cn = new Main(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }}


