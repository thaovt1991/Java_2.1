package Week2.Array;

import java.util.Scanner;

public class InsertElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập độ dài của mảng : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài của mảng phải nhở hơn  20! ");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Phân tử " + i + " của mảng : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập giá trị cần chèn vào mảng : ");
        int number = scanner.nextInt();
        int index;
        do {
            System.out.print("Nhập vị trí chèn trong mảng : ");
            index = scanner.nextInt();
            if ((index > arr.length - 1) || (index <= -1 )) {
                System.out.println("Không chèn được phần tử vào mảng !");
            }
        } while (index > arr.length - 1);
        for (int i = arr.length -1 ; i > index ;i--){
            arr[i] = arr[i-1] ;
        }
        arr[index] = number ;
        System.out.println("Mảng sau khi chèn '"+ number +"' vào vị trí '" + index + "' của mảng là : ");
        for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}

