package Week2.Array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArr1, sizeArr2;
        do {
            System.out.print("Nhập kích thước của mảng 1 : ");
            sizeArr1 = scanner.nextInt();
            if (sizeArr1 > 15) {
                System.out.println("Kích thước của mảng phải nhỏ hơn 15 !");
            }
        }while (sizeArr1 > 15) ;
        int[] arrOne = new int[sizeArr1] ;
        for (int i = 0; i < sizeArr1; i++ ){
            System.out.print("Nhập phần tử "+ i+ " của mảng : ");
            arrOne[i] = scanner.nextInt();
        }
        System.out.println();
        do {
            System.out.print("Nhập kích thước của mảng 2 : ");
            sizeArr2 = scanner.nextInt();
            if (sizeArr2 > 15) {
                System.out.println("Kích thước của mảng phải nhỏ hơn 15 !");
            }
        }while (sizeArr2 > 15) ;
        int[] arrTow = new int[sizeArr2] ;
        for (int i = 0; i < sizeArr2; i++ ){
            System.out.print("Nhập phần tử "+ i+ " của mảng : ");
            arrTow[i] = scanner.nextInt();
        }
        int[] arrThree = new int [arrOne.length + arrTow.length] ;
        for (int i =0 ; i < arrOne.length ;i++){
            arrThree[i] = arrOne[i] ;
        }
        for (int j = 0 ; j < arrTow.length ; j++){
            arrThree[arrOne.length + j] = arrTow [j] ;
        }
        System.out.print("Mảng sau khi gộp có '" + arrThree.length + "' phần tử  là : ");
        for (int i = 0; i < arrThree.length ; i++){
            System.out.print(arrThree[i] + "  ");
        }
    }
}
