package Week2.OOP.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a , b, c, delta ;
        System.out.println("Input Quadratic Equation !");
        System.out.print("Input a: ");
        a = scanner.nextDouble() ;
        System.out.print("Input b: ");
        b = scanner.nextDouble() ;
        System.out.print("Input c: ");
        c = scanner.nextDouble() ;
        QuadraticEquation X = new QuadraticEquation(a,b,c) ;
        delta = X.getDiscriminant();
        if (delta > 0){
            System.out.println("The equation has 2 constraints : "+ (-b + Math.sqrt(delta))/(2*a) + " and " +  (-b - Math.sqrt(delta))/(2*a) );
        }else if(delta == 0 ){
            System.out.println("The equation with 1 solution is: " + (-b / (2*a)));
        }else {
            System.out.println("The equation has no solution!");
        }
    }
}
