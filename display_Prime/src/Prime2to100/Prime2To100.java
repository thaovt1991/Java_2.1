package Prime2to100;

import java.util.Scanner;

public class Prime2To100 {
    public static Boolean chekPrime(int a){
        boolean check = false ;
        if (a < 2 ){
            check = true ;
        }else {
            int i = 2 ;
            check = true;
            while (i <= Math.sqrt(a))  {
                if (a % i == 0){
                    check = false ;
                    break;
                }
                i++ ;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String str = "Các số nguyên tố nhỏ hơn 100 là : " ;
        int num = 2 ;
        while (num < 100){
            if (chekPrime(num)){
                str+= num + ", " ;
            }
            num ++ ;
        }
        System.out.println(str);
    }
}
