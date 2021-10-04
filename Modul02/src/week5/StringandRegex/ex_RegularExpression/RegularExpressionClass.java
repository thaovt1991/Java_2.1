package week5.StringandRegex.ex_RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionClass {

    public static final String CLASS_REGEX ="[C|A|P]+\\d{4}+[G|H|I|K|L|M]$";

    public RegularExpressionClass(){
    }

    public boolean isClass(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX) ;
        Matcher matcher = pattern.matcher(regex) ;
        return matcher.matches() ;
//        return Pattern.compile(CLASS_REGEX).matcher(regex).matches();
    }
}
