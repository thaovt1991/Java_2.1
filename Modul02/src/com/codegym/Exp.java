package com.codegym;

//public class Exp {
////    public static void main(String[] args) {
////        double a = Math.sqrt(8) ;
////        System.out.println(a * a );
//    }
public class Exp {
    public static void main(String [] args)     {


        try {
            int x = 0;
            int y = 5 / x;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }catch (Exception ae) {
            System.out.println("Exception");
        }
        System.out.println("finished");
        }
    }


