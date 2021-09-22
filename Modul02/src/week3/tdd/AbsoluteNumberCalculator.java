package week3.tdd;


public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        return Math.abs(number);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?+(\\,\\d+)?");  //trung khop
    }

    public static void main(String[] args) {
        if (isNumeric("1000000,5")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
