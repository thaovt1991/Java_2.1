package week5.StringandRegex.isNUmberPhone;

public class NumberPhoneTest {
    static String[] arr = {"(84)-(0978489648)","(a8)-(22222222)","(814)-(0978489648)"} ;

    public static void main(String[] args) {
        NumberPhone check = new NumberPhone() ;
        for (String number : arr){
            if(check.isNumberPhone(number)){
                System.out.println(number + " is number phone !");
            }else System.out.println(number + " is not number phone !");
        }
    }
}
