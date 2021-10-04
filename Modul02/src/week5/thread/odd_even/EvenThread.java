package week5.thread.odd_even;

public class EvenThread extends Thread{
    private int num ;

    public EvenThread (){
        num = 0;
    }
    public EvenThread(int num){
        this.num = num ;
    }
    @Override
    public void run(){
        int i ;
        if (num % 2 ==0){
            i = num ;
        }else i = num +1 ;
        int j = 1;
        try {
            while (j<=10){
                System.out.println("Even num "+j +" : " + i );
                j++;
                i = i+2;
                Thread.sleep(15);
            }
        }catch (Exception e) {
            System.out.println("number max size");
        }
        System.out.println("Complete !");
    }

}
