package sorting;

/**
 * This class provides a method to sort an array using the QuickSort algorithm.
 */
public class QuickSort {

    /**
     * Sorts the specified portion of the array using the QuickSort algorithm.
     *
     * @param arr   the array to be sorted
     * @param left  the starting index of the portion to be sorted
     * @param right the ending index of the portion to be sorted
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    /**
     * Partitions the specified portion of the array around a pivot, such that
     * elements less than the pivot are to its left and elements greater than
     * the pivot are to its right.
     *
     * @param arr   the array to be partitioned
     * @param left  the starting index of the portion to be partitioned
     * @param right the ending index of the portion to be partitioned
     * @return the index of the pivot after partitioning
     */
    public static int partition(int[] arr, int left, int right) {
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
     * Swaps the elements at the specified positions in the array.
     *
     * @param arr the array in which the elements are to be swapped
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
