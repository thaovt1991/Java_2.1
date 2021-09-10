package Week2.Array;

import java.util.Scanner;

public class MinOfArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of Array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Input Array ");
        for (int i = 0; i < size; i++) {
            System.out.print("Input element '" + i + "' of array : ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int j = 1;
        while (j < arr.length) {
            if (min > arr[j]) {
                min = arr[j];
            }
            j++;
        }
        System.out.println("Min of array : " + min);
    }
}
