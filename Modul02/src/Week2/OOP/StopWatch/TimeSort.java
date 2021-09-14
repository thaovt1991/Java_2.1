package Week2.OOP.StopWatch;

import java.util.Arrays ;

public class TimeSort {
    public static int[] selectionSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 10000);
        }
        watch.start();
        a = selectionSort(a);
        System.out.println(Arrays.toString(a));
        watch.stop();
        System.out.println("Time : " + watch.getElapsedTime() + " milliseconds " );
        System.out.println(watch.toString());
    }
}
