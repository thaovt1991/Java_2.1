package week3.clean_code_and_refactoring.caculator;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public Calculator(){};

    public double calculate(double firstOperand, double secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand ;
            case SUBTRACTION :
                return firstOperand - secondOperand ;
            case MULTIPLICATION :
                return firstOperand * secondOperand ;
            case DIVISION :
                if (secondOperand  != 0)
                    return firstOperand / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

}
