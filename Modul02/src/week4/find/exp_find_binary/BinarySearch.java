package week4.find.exp_find_binary;

public class BinarySearch {
    private static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else {
                if (arr[mid] > x) {
                    right = mid -1 ;
                } else left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(list, 2));  /* 0 */
        System.out.println(search(list, 11)); /* 4 */
        System.out.println(search(list, 79)); /*12 */
        System.out.println(search(list, 1));  /*-1 */
        System.out.println(search(list, 5));  /*-1 */
        System.out.println(search(list, 80)); /*-1 */
    }
}
