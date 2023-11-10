package selection;

public class QuickSelect {

    /**
     * Finds and returns the kth largest element in the array.
     *
     * @param arr The input array.
     * @param k   The position from the largest element perspective (1-based index).
     * @return The kth largest element in the array.
     */
    public static int findKthLargest(int[] arr, int k) {
        int i = arr.length - k;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int p = partition(arr, left, right);
            if (p < i) {
                left = p + 1;
            } else if (p > i) {
                right = p - 1;
            } else {
                break;
            }
        }
        return arr[i];
    }

    /**
     * Partitions the array using Lomuto's partitioning scheme and returns the
     * pivot's position.
     *
     * @param arr   The input array.
     * @param left  The starting index of the segment to be partitioned.
     * @param right The ending index of the segment to be partitioned.
     * @return The final position of the pivot after partitioning.
     */
    private static int partition(int[] arr, int left, int right) {
        int middle = left + (right - left) / 2;
        swap(arr, middle, right);

        int p = arr[right];
        int pivotIndex = right;

        while (left < right) {
            while (left < right && arr[left] <= p) {
                left++;
            }
            while (left < right && arr[right] >= p) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }

        swap(arr, left, pivotIndex);
        return left;
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param arr The array containing the elements to be swapped.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
