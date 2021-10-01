package week5.thread.thread_ex;

public class NumberGenerator implements Runnable {
    private int num ;

    public NumberGenerator(int i){
       this.num = i;
    }
   @Override
    public void run() {
        int i = this.num;
       try {
           int j= 1;
           System.out.println("10 so sau "+ num + " la :");
           while (i< num+10){
                System.out.println(j +" : " + i );
                j++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("number max size");
        }
        System.out.println("Complete !");
    }
}
