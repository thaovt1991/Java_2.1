package com.codegym;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int choice ;
        do{
        System.out.println("Menu");
        System.out.println("1.Draw the rectangle ");
        System.out.println("2.Draw the triangle  (The corner is square at 4 different angles: top-left, top-right, bottom - left, bottom-right)");
        System.out.println("3.Draw isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice){
            case 1 :{
                System.out.println("Draw the rectangle");
                System.out.print("Input Width Rectangle : ");
                int widthRec = input.nextInt();
                System.out.print("Input Height Rectangle : ");
                int heightRec ;
                heightRec = input.nextInt() ;
                for (int i = 1; i <= heightRec; i++) {
                    for (int j = 1; j <= widthRec; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2 : {
                System.out.println("Draw the triangle");
                System.out.println("Menu");
                System.out.println("a. bottom - left");
                System.out.println("b. bottom - right");
                System.out.println("c. top - left");
                System.out.println("d. top - right");
                Scanner scanner = new Scanner(System.in) ;
                System.out.print("Input Changer: ");
                String changer = scanner.nextLine() ;
                System.out.print("Input Width Triangle : ");
                int widthT = input.nextInt();

                switch (changer){
                    case "a":{
                        System.out.println("bottom -left ");
                         for (int i = 1; i <= widthT ; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" * ");
                                }
                            System.out.println();
                         }
                         break;
                    }
                    case "b" :{
                        System.out.println(" bottom - right ");
                        for (int i = 1 ; i <= widthT ; i++){
                             for (int j = widthT - i; j >=1; j-- ) {
                                 System.out.print("   ");
                              }
                             for (int k = 1 ; k<= i ; k++){
                                 System.out.print(" * ");
                             }
                            System.out.println();
                        }
                        break;
                      }
                    case "c" :{
                        System.out.println(" top - left ");
                        for (int i = 1 ; i <= widthT ; i++){

                            for (int j = widthT - i; j >=1; j-- ) {
                                System.out.print(" * ");
                            }
                            for (int k = 1 ; k<= i ; k++){
                                System.out.print("   ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case "d" :{
                        System.out.println(" top - right ");
                        for (int i = 1 ; i <= widthT ; i++){
                            for (int k = 1 ; k<= i ; k++) {
                                System.out.print("   ");
                            }
                            for (int j = widthT - i; j >=1; j-- ) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    default:
                        System.out.println("No choice!");
                }

                break;
            }
            case 3 :{
                System.out.println("Draw isosceles triangle");
                System.out.print("Input Width : ");
                int widthTri = input.nextInt();

                for (int i = 1; i <= widthTri; ++i) {
                    for (int j = 1; j <= widthTri - i; j ++) {
                        System.out.print("   ");
                    }
                    for (int k =1 ; k <= 2*i -1 ;k++ ) {
                        System.out.print(" * ");
                    }
                    System.out.println();
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