package week5.thread.prime;

public class Main {
    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new LazyPrimeFactorization(200));
            Thread t2 = new Thread(new OptimizedPrimeFactorization(200));
            t1.start();
            t2.start();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
