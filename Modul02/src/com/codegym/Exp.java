package com.codegym;

public class Exp {
    public static void main(String[] args) {
        try {
            int []a = new int[5];
            System.out.println(a[5]);
//            a[4] = 30 / 0;
          String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+ e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally");
        }
    }
}

