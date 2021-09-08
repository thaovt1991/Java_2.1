package com.codegym;
import java.util.Scanner ;


public class Main {
    public  static String readOnes(int a) {
        String str = "" ;
        switch (a) {
            case 0: {
                str ="zero";
                break;
            }
            case 1: {
                str = "one";
                break;
            }
            case 2: {
                str = "two";
                break;
            }
            case 3: {
                str = "three";
                break;
            }
            case 4: {
                str = "four";
                break;
            }
            case 5: {
                str = "five";
                break;
            }
            case 6: {
                str = "six";
                break;
            }
            case 7: {
                str = "seven";
                break;
            }
            case 8: {
                str = "eight";
                break;
            }
            case 9: {
                str = "nine";
                break;
            }
        }
       return str ;
    }

    public  static String read10_19(int a) {
        String str = "" ;
        switch (a) {
            case 10: {
                str = "ten";
                break;
            }
            case 11: {
                str = "eleven";
                break;
            }
            case 12: {
                str = "twelve";
                break;
            }
            case 13: {
                str = "thirteen";
                break;
            }
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:{
                int mod = a % 10 ;
                str = readOnes(mod) + "teen"  ;
                break;
            }
        }
        return  str ;
    }
    public  static String readGreater20(int a){
        String str = "" ;
        switch (a){
            case 2 :
               str = "twenty";
                break;
            case 3 :
                str = "thirty";
                break;
            case 4 :
                str = "forty";
                break;
            case 5:
                str = "fifty";
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9:
                str = readOnes(a) + "ty" ;
                break;

        }
        return str ;
    }


    public static void main(String[] args) {
	     short weight ;
	     Scanner scanner = new Scanner(System.in);
         System.out.print("Input weight: ");
	     weight = scanner.nextShort();
         int hundred =  weight  /  100 ;
         int dozens  = weight % 100 ;
         int ones = weight % 10 ;
        String readH ="";
        String readD ="";

        if (hundred != 0) {
            if (weight % 100 == 0) {
                readH = readOnes(hundred) + " hundred";
            } else {
                readH = readOnes(hundred) + " hundred and ";
            }
        }

        if(dozens >= 20){
            if (ones != 0) {
            readD = readGreater20(  dozens/ 10 )+ " " + readOnes(ones) ;
            }else
                readD = readGreater20(  dozens/ 10 ) ;
        }else {
            if (dozens >= 10) {
                readD = read10_19(dozens);
            } else {
                if (ones != 0) {
                    readD =  readOnes(ones);
                }
            }
        }
            System.out.print(weight + " read is '" + readH + readD + "' kg ");
    }
}

