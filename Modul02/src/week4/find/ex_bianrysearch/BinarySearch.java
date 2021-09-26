package week4.find.ex_bianrysearch;

public class BinarySearch {
    private static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) return middle;
            if (array[middle] > value) right = middle - 1;
            else left = middle + 1;
           return binarySearch(array, left, right, value);
        }
        return -1;

    }


    public static void main(String[] args) {
        //  int[] list = new int[]{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 0, list.length, 2));  /* 0 */
        System.out.println(binarySearch(list, 0, list.length, 11)); /* 4 */
        System.out.println(binarySearch(list, 0, list.length, 79)); /*12 */
        System.out.println(binarySearch(list, 0, list.length, 1));  /*-1 */
        System.out.println(binarySearch(list, 0, list.length, 5));  /*-1 */
        System.out.println(binarySearch(list, 0, list.length, 80)); /*-1 */
    }
}
