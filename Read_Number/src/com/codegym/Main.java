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
            case 0: {
                str = "ten";
                break;
            }
            case 1: {
                str = "eleven";
                break;
            }
            case 2: {
                str = "twelve";
                break;
            }
            case 3: {
                str = "thirteen";
                break;
            }
            case 5:
                str = "fifteen";
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:{
                str = readOnes(a) + "teen"  ;
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
            case 5 :
                str = "fixty";
                break;
            case 4 :
            case 6 :
            case 7 :
            case 8 :
            case 9:
                str = readOnes(a) + "ty" ;
                break;

        }
        return str ;
    }
    public static String readNumber(int a){

        int hundred =  a  /  100 ;
        int dozens  = a % 100 ;
        int ones = a % 10 ;
        String readNumber ="";

        if (hundred != 0) {
            if (a % 100 == 0) {
                readNumber = readOnes(hundred) + " hundred";
            } else {
                readNumber = readOnes(hundred) + " hundred and ";
            }
        }

        if(dozens >= 20){
            if (ones != 0) {
                readNumber += readGreater20(  dozens/ 10 )+ " " + readOnes(ones) ;
            }else
                readNumber += readGreater20(  dozens/ 10 ) ;
        }else  {
            if (dozens >= 10) {
                readNumber += read10_19(dozens % 10);
            } else {
                if (ones != 0) {
                    readNumber +=  readOnes(ones);
                }
            }
        }
        return readNumber ;
    }




    public static void main(String[] args) {
        short weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight : ");
        weight = scanner.nextShort();
        String readWeight = readNumber(weight);
        System.out.print("Input your height : ");
        height = scanner.nextShort();
        String readHeight = readNumber(height);
        System.out.printf("Your weight is '%s' kg and your height is '%s' centimeter ",readWeight,readHeight );
    }
}




