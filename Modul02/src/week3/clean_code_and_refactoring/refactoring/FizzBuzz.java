package week3.clean_code_and_refactoring.refactoring;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0 ;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}

