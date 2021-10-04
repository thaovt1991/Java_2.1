package week5.StringandRegex.regularExpression;

import java.util.Scanner;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        emailExample = new EmailExample();
//        for (String email : validEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isvalid);
//        }
//        for (String email : invalidEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isvalid);
//        }
        Scanner input = new Scanner(System.in);
        System.out.print("input email check :");
        String email = input.nextLine();
        boolean isEmail = emailExample.validate(email) ;
        System.out.println("Email is " + email +" is valid: "+ isEmail);
    }
}
