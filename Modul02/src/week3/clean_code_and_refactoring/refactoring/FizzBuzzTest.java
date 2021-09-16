package week3.clean_code_and_refactoring.refactoring;

public class FizzBuzzTest {
    public static void main(String[] args) {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
        if (expected == result ) {
            System.out.println("True");
        }else System.out.println("False");
    }
}
