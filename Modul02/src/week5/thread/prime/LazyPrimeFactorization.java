package week5.thread.prime;

public class LazyPrimeFactorization implements Runnable{
    private int numRanger;

    public LazyPrimeFactorization() {
        this.numRanger = 0;
    }

    public LazyPrimeFactorization(int num) {
        this.numRanger = num;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        String str ="";
        try {
            int i = 2;
            if (i > numRanger) {
                str = "Not have number prime !";
            } else {
                str= "List prime numbers : ";
                int count = 0;
                while (i <= numRanger) {
                    if (isPrime(i)) {
                        count ++;
                        str += i + "  ";
                        System.out.println( "LazyPrimeFactorization "+count +" :" +i);
                        Thread.sleep(100);
                    }
                    i++;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Complete LazyPrimeFactorization !");
        System.out.println(str);
    }
}
