package week4.Debug.arrayExample;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd= new Random() ;
        Integer[]arr = new Integer[100];
        System.out.println("The list of element of array !");
        for(int i = 0; i < 100; i++){
            arr[i] = rd.nextInt(100) ;//(int)(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        return arr ;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please enter the index of any element : ");
        int x = scanner.nextInt();
        try {
            System.out.println("The value of " + x + " is " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("The index exceeds the limit of the array");
        }
    }
}
