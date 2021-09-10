package Week2.Array;

import java.util.Scanner;

public class FindMaxofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        do {
            System.out.print("Nhập kích thước mảng : ");
            size = scanner.nextInt() ;
            if (size > 20){
                System.out.println("Kích thước mảng phải nhỏ hơn 20 !");
            }
        }while (size > 20) ;
        int[] arr = new int[size] ;
        for (int i =0 ; i<size ; i++){
            System.out.print("Nhập phần tử thứ "+ i + " của mảng: ");
            arr[i] = scanner.nextInt() ;
        }
        int max = arr[0] ;
        int index = 1 ;
        System.out.print("Các phần tử của mảng : ");
        for (int j = 0; j < arr.length ; j++){
            System.out.print(arr[j]+ "   ");
            if(arr[j] > max){
                max = arr[j] ;
                index = j + 1 ;
            }
        }
        System.out.print("\nPhần tử lớn nhất trong mảng là : " + max + " tại vị trí thứ " + index);
    }
}
