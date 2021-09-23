package week3.dsa_stack_queue.demerging;

import java.util.Scanner;

public class Demerging {
    public static void main(String[] args) {
        Queue QueueNu = new Queue();
        Queue QueueNam = new Queue();

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong nguoi trong danh sach : ");
        int num = input.nextInt();
        String name, gender;
        int day, month, year;
        int i = 1;
        while (i <= num) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Ho va ten  " + i + ": ");
            name = scanner.nextLine();
            do {
            System.out.print(" Gioi tinh " + i + ": ");
            gender = scanner.nextLine();
                if((!gender.equals("NU") ) && (!gender.equals("NAM") )){
                    System.out.println("Nhap lai gioi tinh !");
                }
            }
            while ((!gender.equals("NU")) && (!gender.equals("NAM")));

            Scanner integer = new Scanner(System.in);
            System.out.print(" Ngay sinh " + i + ": ");
            day = integer.nextInt();
            System.out.print(" Thang sinh " + i + ": ");
            month = integer.nextInt();
            System.out.print(" Nam sinh " + i + ": ");
            year = integer.nextInt();
            if (gender.equals("NU")) {
                QueueNu.enQueue(name, gender, day, month, year);
            } else
                QueueNam.enQueue(name, gender, day, month, year);
            i++;
        }
        while (!QueueNu.isEmpty()){
            System.out.println(QueueNu.deQueue());
        }
        while (!QueueNam.isEmpty()){
            System.out.println(QueueNam.deQueue());
        }

    }
}

