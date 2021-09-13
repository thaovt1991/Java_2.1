package Week2.OOP.StopWatch;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choce;
        do {
            System.out.println("'''''''Stop Watch !'''''''");
            System.out.println("Menu");
            System.out.println("1. Start ");
            System.out.println("2. End ");
            System.out.println("0. Exit");
            boolean check = watch.getRunning();
            System.out.print("Select ! : ");
            choce = scanner.nextInt();
            if (!check) {
                if (choce == 2) {
                    System.out.println("Let's run Watch ");
                    System.out.print("Select ! : ");
                    choce = scanner.nextInt();
                }
            } else {
                if (choce == 1) {
                    System.out.println("Watch is running !");
                    System.out.print("Select ! : ");
                    choce = scanner.nextInt();
                }
            }

            switch (choce) {
                case 1: {
                    watch.start();
                    System.out.println("Start Time  : " + watch.getStartTime());
                    break;
                }
                case 2: {
                    watch.stop();
                    System.out.println("End Time : " + watch.getStopTime());
                    System.out.println("Total Time = " + watch.getElapsedTime() );
                    break;
                }
                case 0:
                    System.exit(0);
            }
            System.out.println();
        }while((choce != 0 ));
    }
}