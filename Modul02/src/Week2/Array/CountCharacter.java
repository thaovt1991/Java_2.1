package Week2.Array;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        char c ;
        System.out.print("Nhập chuỗi cần kiểm tra : ");
        str = scanner.nextLine();
        System.out.print("Nhập kí tự cần kiểm tra : ");
        c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Trong chuỗi '"+ str + "' có "+ count + " kí tự '"+ c + "'" );
    }
}
