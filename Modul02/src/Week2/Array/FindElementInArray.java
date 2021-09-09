package Week2.Array;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Na","Hoang","Phu","Tuong","Thao"} ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Nhập vào một tên học sinh : ");
        String name = scanner.nextLine() ;
        boolean check = false ;
        for(int i = 0 ; i < students.length; i ++){
            if (students[i].equals(name)) {
                System.out.printf("Vị trí của học sinh '%s' trong danh sách là : " +(i+1) , name );
                check = true ;
                break;
            }
        }
        if (!check ) {
            System.out.print(" Không tìm thấy tên '"+name+ "' trong danh sách học sinh");
        }

    }
}
