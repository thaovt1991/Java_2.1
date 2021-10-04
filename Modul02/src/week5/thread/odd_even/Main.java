package week5.thread.odd_even;

public class Main {
    public static void main(String[] args) {
        OddThread numOdd = new OddThread();
        EvenThread numEven = new EvenThread();
        numOdd.start();
        try {
            numOdd.join(175);///chay truoc 175ms
        } catch (Exception e) {
            System.out.println(e);
        }
        numEven.start();
    }
}
