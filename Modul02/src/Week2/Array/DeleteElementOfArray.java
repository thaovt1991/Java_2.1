package Week2.Array;


import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        do {
            System.out.print("Nhập độ dài của mảng : ");
            size = scanner.nextInt() ;
            if(size > 20) {
                System.out.println("Độ dài của mảng phải nhở hơn  20! ");
            }
        }while (size > 20);
        int[]arr = new int [size] ;
        for (int i = 0 ; i < size ; i++){
            System.out.print("Phân tử " + i + " của mảng : ");
            arr[i] = scanner.nextInt() ;
        }
//        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.print("Nhập giá trị cần xét trong mảng : ");
        int a = scanner.nextInt() ;
        int count = 0;
        while (findOfArray(a , arr) != -1){
            count++;
            int index = findOfArray(a , arr) ;
            for (int i = index ; i <arr.length - count ;i++ ){
                arr[i] = arr[i+1];
            }
            arr[arr.length - count] = 0 ;
        }
        if(count != 0){
            System.out.println("Có '" + count + "' giá trị '" + a +"' trong mảng !");
            System.out.print("Mảng sao khi xóa là : ");
        }else {
            System.out.println("Không giá trị " + a +" trong mảng !");
            System.out.print("Mảng là : ");
        }
        for ( int j = 0; j < arr.length ; j++){
            System.out.print(arr[j] + "  ");
        }


    }
    public static int findOfArray(int a , int[]array){
        int index = -1 ;
        for (int i = 0; i < array.length ;i++){
            if (a == array[i]){
                index = i ;
                break;
            }
        }
        return index ;
    }
}
