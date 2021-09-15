package Week2.inheritance.geometry;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double s1, s2, s3 ;
        do{
            System.out.print("Input side 1: ");
            s1 = scanner.nextDouble();
            System.out.print("Input side 2: ");
            s2 = scanner.nextDouble();
            System.out.print("Input side 3: ");
            s3 = scanner.nextDouble();
            if (s1 + s2 <= s3 || s2 +s3 <= s1 || s1 + s3 > s2 ){
                System.out.println("The sides is not sides of Triangle !");
            }
        }while (s1 + s2 <= s3 || s2 +s3 <= s1 || s1 + s3 > s2 ) ;
        Triangle triangle = new Triangle(s1,s2,s3);
        System.out.println(triangle);
    }
}
