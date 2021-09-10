package Week2.Array;

import java.util.Scanner;

public class SumRowOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.print("Nhập kích thước mảng 2 chiều : ");
        row = scanner.nextInt();
        System.out.print("Nhập kích thước mảng phân tử :");
        column = scanner.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Nhập mảng 2 chiều có kích thước là '" + row + "' , độ dài của mảng phần tử là '" + column + "' !");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử " + j + " của mảng Array[" + i + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều nhận được là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println(arr[i][arr[i].length - 1] + " ] ");
        }
        int col, sum = 0;
        do {
            System.out.print("Nhập cột cần tính tổng : ");
            col = scanner.nextInt();
            if ((col < 0) || (col > column)) {
                System.out.println("Cột không tồn tại trong mảng");
            }
        } while ((col < 0) || (col > column));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng các số tại cột '"+ col+"' của mảng là : " + sum);

    }
}
