package week3.dsa_stack_queue.demerging;

import java.util.LinkedList;
import java.util.Scanner;

public class Demerge {

    public static void main(String[] args) {

        LinkedList queueNu = new LinkedList();
        LinkedList queueNam = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong nguoi trong danh sach : ");
        int num = input.nextInt();

        String name, gender;
        int day, month, year;
        int i = 1;
        while (i <= num) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Ho va ten nv" + i + ": ");
            name = scanner.nextLine();
            do {
                System.out.print(" Gioi tinh nv" + i + ": ");
                gender = scanner.nextLine();
                if ((!gender.equals("NU")) && (!gender.equals("NAM"))) {
                    System.out.println("Nhap lai gioi tinh !");
                }
            }
            while ((!gender.equals("NU")) && (!gender.equals("NAM")));

            Scanner integer = new Scanner(System.in);
            System.out.print(" Ngay sinh nv" + i + ": ");
            day = integer.nextInt();
            System.out.print(" Thang sinh nv" + i + ": ");
            month = integer.nextInt();
            System.out.print(" Nam sinh nv" + i + ": ");
            year = integer.nextInt();
            String data = name + ", " + gender + ", " + day + "/" + month + "/" + year;
            if (gender.equals("NU")) {
                queueNu.addFirst(data);
            } else
                queueNam.addFirst(data);
            i++;
        }
        while (!queueNu.isEmpty()) {
            System.out.println(queueNu.pollLast());
        }
        while (!queueNam.isEmpty()) {
            System.out.println(queueNam.pollLast());
        }
    }
}

