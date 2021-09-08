package com.codegym;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double weight, height, bmi ;
        System.out.print("weight (in kilogram) : ");
        weight = scanner.nextDouble() ;

        System.out.print("height (in met) : ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n"); //20 khoang cách .5 làm tròn
        if (bmi < 18)
            System.out.printf("%-20.3f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.3f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.3f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.3f%s", bmi, "Obese");
    }
}

