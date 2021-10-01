package week5.thread.thread_ex;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
          //  System.out.println("Input number begin 1 :");
            int n1 = Integer.MAX_VALUE - 100 ;/* scanner.nextInt();*/
            System.out.println("Input number begin 2 :");
            int n2 = scanner.nextInt();
            NumberGenerator num1 = new NumberGenerator(n1);
            NumberGenerator num2 = new NumberGenerator(n2);

            Thread thread1 = new Thread(num1);
            Thread thread2 = new Thread(num2);
            thread1.start();
            thread2.start();
        }catch (NoSuchElementException e){
            System.out.println("Not number!");
        }


    }
}

