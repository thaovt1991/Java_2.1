package com.codegym;

import java.util.Scanner;

public class Main {

    public static Boolean chekPrime(int a){
        boolean check = false ;
        if (a < 2 ){
            check = true ;
        }else {
            int i = 2 ;
            check = true;
         while (i < Math.sqrt(a))  {
             if (a % i == 0){
                 check = false ;
                 break;
             }
             i++ ;
         }
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Nhập số bắt đầu : ");
        int number = scanner.nextInt() ;
        int count = 0  ;
        String str ="20 số nguyên tố bắt đầu từ " + number + " là: ";
        while (count < 20) {
           if (chekPrime(number) ){
               count ++ ;
               str += number + ", " ;
            }
           number ++ ;
        }
        System.out.println(str);

    }
}
