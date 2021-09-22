package week3.dsa_stack_queue.check_bracket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        LinkedList<Character> stack = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("input string test : ");
        String str = input.nextLine();
        boolean isTrue = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.size() == 0) {
                    isTrue = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() != 0) {
            isTrue = false;
        }
        if (isTrue) {
            System.out.println("Well");
        } else System.out.println("???");
    }
}

