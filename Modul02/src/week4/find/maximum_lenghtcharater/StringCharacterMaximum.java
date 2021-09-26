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

        for (int i = 0; i < string.length() ; i++){   //lap n lan
            list.add(string.charAt(i)) ;
            for (int j= i+1; j< string.length() ;j++){     //lap n-1 lan
                if(string.charAt(j) > list.getLast()) list.add(string.charAt(j));  // 1 cau lenh
                else break;
            }
            if (list.size() > max.size()){      // 1 cau lenh
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println("Output , longest ascending sequence is : "); // 1 cau lenh
        for (char character : max){  // 1 vong lap
            System.out.print(character); // 1 cau lenh
        }
    }
}
/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                           *
 * 	1 vòng lặp bên ngoài = n;                                                     *
 * 	1 vòng lặp bên trong = n - 1;                                                 *
 *  1 câu lệnh = 1                                                                *
 * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
 *  T(n) = (n * (n - 1)) + (1 + 1);    = O(max(n^2, n) + O(n)                     *
 *  T(n) = O(n^2) + O(n);       //max( O(n^2) , O(n)  )                           *
 * 	T(n) = O(n^2);                                                                *
 * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
 *********************************************************************************/
