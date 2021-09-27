package week4.sort.ex_insert_sort;

public class InsertSort {
    public static double [] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void insertionSort(double[] array){
        double  x;
        int pos ;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("After sort : ");
        for (int i =0 ; i < list.length ;i++){
            System.out.print(list[i] + ", ");
        }
    }

}
