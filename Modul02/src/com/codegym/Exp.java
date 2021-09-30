package com.codegym;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeArrayInfo;

import java.io.CharArrayReader;
import java.io.IOException;

//public class Exp {
////    public static void main(String[] args) {
////        double a = Math.sqrt(8) ;
////        System.out.println(a * a );
//    }
public class Exp {

        public static void main(String [] args) {
            try         {
                badMethod();
                System.out.print("A");
            }  catch (Exception ex)  {
                System.out.print("B");
            } finally {
                System.out.print("C");
            }
            System.out.print("D");
        }
        public static void badMethod(){
            throw new RuntimeException();
        }
    }


