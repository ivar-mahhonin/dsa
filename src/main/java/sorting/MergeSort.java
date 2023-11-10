package sorting;

/**
 * This class provides a method for sorting an array using the Merge Sort
 * algorithm.
 */
public abstract class MergeSort {

    /**
     * Sorts the specified portion of the array using the Merge Sort algorithm.
     *
     * @param array The array to be sorted.
     * @param left  The starting index of the portion of the array to be sorted.
     * @param right The ending index of the portion of the array to be sorted.
     */
    static void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int m = (left + right) / 2;
        mergeSort(array, left, m);
        mergeSort(array, m + 1, right);
        merge(array, left, m, m + 1, right);
    }

    /**
     * Merges two sorted subarrays of the specified array.
     *
     * @param array      The array containing the subarrays to be merged.
     * @param leftStart  The starting index of the first subarray.
     * @param leftEnd    The ending index of the first subarray.
     * @param rightStart The starting index of the second subarray.
     * @param rightEnd   The ending index of the second subarray.
     * @return The array containing the merged subarrays.
     */
    private static void merge(int[] array, int leftStart, int leftEnd, int rightStart, int rightEnd) {
        int leftSize = leftEnd - leftStart + 1;
        int rightSize = rightEnd - rightStart + 1;
        int[] leftTemp = new int[leftSize];
        int[] rightTemp = new int[rightSize];

        System.arraycopy(array, leftStart, leftTemp, 0, leftSize);
        System.arraycopy(array, rightStart, rightTemp, 0, rightSize);

        int current = leftStart, i = 0, j = 0;

        while (i < leftSize && j < rightSize) {
            if (leftTemp[i] <= rightTemp[j]) {
                array[current++] = leftTemp[i++];
            } else {
                array[current++] = rightTemp[j++];
            }
        }

        while (i < leftSize) {
            array[current++] = leftTemp[i++];
        }

        while (j < rightSize) {
            array[current++] = rightTemp[j++];
        }
    }
}
