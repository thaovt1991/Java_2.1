package week3.dsa_stack_queue.ex_stack_decimal_convert_binary;


import java.util.LinkedList;
import java.util.Scanner;

public class StackConvert {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList() ;
        Scanner input = new Scanner(System.in);
        System.out.print("Number need convert : ");
        int number = input.nextInt() ;
        final int NUM = number ;
        while (number != 0){
            stack.push(number% 2);
            number = number / 2 ;
        }
        String str = "";
        while (!stack.isEmpty()){
            str += stack.pop() ;
        }
        System.out.println("Result : "+ NUM + " = (" + str +")B");
    }

}
