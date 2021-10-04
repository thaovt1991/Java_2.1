package week5.thread.odd_even;

public class OddThread extends Thread {
    private int num ;
    public OddThread() {
        num = 0;
    }

    public OddThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int i ;
        if (num % 2 == 0) {
            i = num + 1;
        } else
            i = num;
        int j = 1;
        try {
            while (j<=10){
                System.out.println("Odd num " +j +" : " + i );
                j++;
                i = i+2;
                Thread.sleep(10);
            }
        }catch (Exception e) {
            System.out.println("number max size");
        }
        System.out.println("Complete !");
    }

}
