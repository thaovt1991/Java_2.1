package com.codegym;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in) ;
        System.out.print("Input name :");
	    String name = scanner.next() ;
        System.out.printf("Hello: %s " , name);
    }
}
