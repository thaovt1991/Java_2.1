package com.codegym;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
	 double money,interestRate  ;
	 int month ;
	 Scanner scanner = new Scanner(System.in) ;
	 System.out.print("Input money : ");
	 money = scanner.nextDouble() ;
	 System.out.print("Input month : ");
	 month= scanner.nextInt() ;
	 System.out.print("Input interest rate: ");
	 interestRate = scanner.nextDouble() ;
     double totalMoneyInterest = 0 ;
     for(int i = 0; i < month; i++){
            totalMoneyInterest += money * (interestRate/100)/12 * month;
        }
     System.out.println("Total of interest: " + totalMoneyInterest);
    }
}
