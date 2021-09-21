package week3.dsa_stack_queue.ex_stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num element : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            stack.push(array[i]);
        }
        System.out.println("Array input :");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Array out :");
        System.out.println(Arrays.toString(array));

        LinkedList<Character> stackString = new LinkedList<>();
        System.out.print("Input string : ");
        Scanner string = new Scanner(System.in) ;
        String str = string.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackString.push(str.charAt(i));
        }
         String strReveres ="";
        for (int i = 0; i < str.length(); i++) {

            strReveres += stackString.pop();
        }
        System.out.print("Out string : ");
        System.out.println(strReveres);

    }
}
