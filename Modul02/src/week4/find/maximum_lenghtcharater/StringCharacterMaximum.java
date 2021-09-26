package week4.find.maximum_lenghtcharater;

import java.util.LinkedList;
import java.util.Scanner;

public class StringCharacterMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string : ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length() ; i++){
            list.add(string.charAt(i)) ;
            for (int j= i+1; j< string.length() ;j++){
                if(string.charAt(j) > list.getLast()) list.add(string.charAt(j));
                else break;
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println("Output , longest ascending sequence is : ");
        for (char character : max){
            System.out.print(character);
        }
    }
}
