package Week2.Array;

import java.util.Scanner;

public class CountMarkStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập kích thước của mảng điểm : ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Kích thước mảng không vượt quá  30 !");
            }
        } while (size > 30);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Nhập điểm học sinh thứ '" + (i + 1) + "' vào mảng điểm :");
                arr[i] = scanner.nextInt();
                if ((arr[i] < 0) || (arr[i] > 10)) {
                    System.out.println("Nhập lại điểm của học sinh !");
                }
            } while ((arr[i] < 0) || (arr[i] > 10));
        }
        int count = 0;
        System.out.println("Mảng điểm là : ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "  ");
            if ((arr[j] >= 5) && (arr[j] <= 10)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Có " + count + " học sinh đỗ !");
    }
}
