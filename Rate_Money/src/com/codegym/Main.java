package com.codegym;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int rate = 23000 ;
        System.out.print("Input USD : ");
         int usd = scanner.nextInt() ;
         System.out.print("Result : "+  rate * usd + " VND") ;
    }
}
