package Week2.Array;

import java.util.Scanner;

public class MaxArrayOfArray {
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
                System.out.print("Nhập phần tử " + j + " của mảng Array[" + i +"] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều nhận được là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length-1; j++) {
                System.out.printf(arr[i][j] + ", " );
            }
            System.out.println(arr[i][arr[i].length -1] + " ] ");
        }
        int maxArr = maxArray(arr[0]);
        for (int i =1 ; i < arr.length ; i ++ ){
            if (maxArr < maxArray(arr[i])){
                maxArr = maxArray(arr[i]) ;
            }
        }
        System.out.print("Phần tử lớn nhất của mảng 2 chiều đã cho là : " + maxArr);
    }
    public static int maxArray(int[]array){
        int max = array[0];
        for (int i = 1; i< array.length ; i++){
            if (max < array[i]) {
                max = array[i] ;
            }
        }
        return  max ;
    }
}
