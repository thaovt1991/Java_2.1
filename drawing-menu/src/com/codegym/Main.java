package com.codegym;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in) ;
	    int choice ;
	    do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
               case 1 : {
                     System.out.println("Draw the triangle");
                     System.out.print("Input Width Triangle : ");
                     int widthT = input.nextInt();
                     for (int i = 1; i <= widthT; i++) {
                          String str = "";
                          for (int j = 1; j <= i; j++) {
                          str += " * ";
                          }
                          System.out.println(str);
                        }
                    break;
               }
               case 2 :{
                     System.out.println("Draw the square");
                     System.out.print("Input Width Square : ");
                     int widthSquare = input.nextInt();
                     for (int i = 1; i <= widthSquare; i++) {
                           String str = "";
                           for (int j = 1; j <= widthSquare; j++) {
                                   str += " * ";
                          }
                           System.out.println(str);
                      }
                     break;
               }
               case 3 :{
                      System.out.println("Draw the rectangle");
                      System.out.print("Input Width Rectangle : ");
                      int widthRec = input.nextInt();
                      System.out.print("Input Height Rectangle : ");
                      int heightRec = input.nextInt() ;
                      for (int i = 1; i <= heightRec; i++) {
                              String str = "";
                              for (int j = 1; j <= widthRec; j++) {
                              str += " * ";
                      }
                     System.out.println(str);
                      }
                      break;
               }
               case 0 :{
                       System.exit(0);
                       break;
               }
               default:
                      System.out.println("No choice!");
        }

    } while (choice != 0) ;
    }
}
