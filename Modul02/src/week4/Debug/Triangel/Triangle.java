package week4.Debug.Triangel;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1 ||
                side1 <= 0 ||
                side2 <= 0 ||
                side3 <= 0)
            throw new IllegalTriangleException(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private class IllegalTriangleException extends Exception {
        private double sideOne;
        private double sideTwo;
        private double sideThree;

        public IllegalTriangleException(double side1, double side2, double side3) {
            super("Illegal sides " + side1 + ",   " + side2 + ",   " + side3);
            this.sideOne = side1;
            this.sideTwo = side2;
            this.sideThree = side3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1 : ");
        double side1 = scanner.nextDouble();
        System.out.println("Input side 2 : ");
        double side2 = scanner.nextDouble();
        System.out.println("Input side 3 : ");
        double side3 = scanner.nextDouble();


        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Triangle have 3 sides is : side 1 = "+ side1 + ", side2 = "+side2 +", side3 = " +side3 );
        } catch (IllegalTriangleException ex) {
            System.out.println("not triangle !");
            System.out.println(ex.getMessage());
        }
    }

}
