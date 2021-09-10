package Week2.Array;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static double celsiusToFahrenheit(double c){
        return (9.0 / 5) * c + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f- 32) *5 / 9.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double c ;
        double f ;
        int choice  ;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Input F : ");
                    f = scanner.nextDouble() ;
                    System.out.println(f + " F = " +fahrenheitToCelsius(f) + " C");
                    break;
                case 2:
                    System.out.print("Input C : ");
                    c = scanner.nextDouble() ;
                    System.out.println(c + " C = "+celsiusToFahrenheit(c) +" F" );
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
