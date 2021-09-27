package week4.sort.bubblesort;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
       boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {

            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                   needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        int[]arr = {3,4,5,2,1} ;
        bubbleSort(arr);
    }
}
