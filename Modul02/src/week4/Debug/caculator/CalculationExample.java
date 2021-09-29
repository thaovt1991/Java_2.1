package week4.Debug.caculator;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = scanner.nextInt();
        System.out.print("Input y : ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculator(x, y);
    }

    public void calculator(int x, int y) {
        try {
            System.out.println("add:  x + y = " + (x + y));
            System.out.println("Sub: x -y = " + (x - y));
            System.out.println("Mul: x * y = " + (x * y));
            System.out.println("Div: x / y = "+(int)(x/y));
        }catch (Exception e){
            System.err.println("An exception occurred ! " + e.getMessage());
        }

    }
}
