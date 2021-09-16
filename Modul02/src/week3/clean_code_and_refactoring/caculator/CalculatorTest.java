package week3.clean_code_and_refactoring.caculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double a, b;
        char o;
        int choise;
        do {
            Scanner check = new Scanner(System.in);
            System.out.println("Caculator ! Ban muon thuc hien tinh toan !");
            System.out.println("  1. Nhan Y de tiep tuc");
            System.out.println("  2. Nhan X đe ket thuc ");
            System.out.println();
            System.out.println(" Hay chon !");
            choise = check.nextLine().charAt(0);
            switch (choise) {
                case 'y':
                case 'Y':
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Nhap a : ");
                    a = scanner.nextDouble();
                    System.out.print("Nhap b : ");
                    b = scanner.nextDouble();
                    do {
                        System.out.print("Nhap phep tinh : ");
                        o = check.nextLine().charAt(0);
                        if (o != '+' && o != '-' && o != '*' && o != '/') {
                            System.out.println("khong co phep tinh nay, hay nhap lai phep tinh !");
                        }
                    } while (o != '+' && o != '-' && o != '*' && o != '/');
                    System.out.println("Resuft : " + a + " " + o + " " + b + " = " + cal.calculate(a, b, o));
                    break;
                case 'x' :
                case 'X' :
                    System.out.println("Cam on ban da su dung Caculator !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hay lua chon theo huong dan ");
            }

        } while (choise!= 'x' && choise!= 'X');
    }

}
