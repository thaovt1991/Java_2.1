package week5.StringandRegex.ex_RegularExpression;

public class RegularExpressionClassTest {
    private static String[] arrClass = {"C0318G","M0318G", "P0323A","a1231P","P123132G","P4G"} ;

    public static void main(String[] args) {
        RegularExpressionClass checkClass = new RegularExpressionClass();
        for (String cls : arrClass){
            if(checkClass.isClass(cls)){
                System.out.println(cls +" is class");
            }else System.out.println(cls+ " is not class");
        }
    }
}
