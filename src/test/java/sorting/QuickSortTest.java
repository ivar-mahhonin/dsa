package sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] arr1 = {3, 6, 8, 10, 1, 2, 1};
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        int[] expected1 = {1, 1, 2, 3, 6, 8, 10};
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        int[] expected2 = {};
        assertArrayEquals(expected2, arr2);

        int[] arr3 = {5};
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        int[] expected3 = {5};
        assertArrayEquals(expected3, arr3);

        int[] arr4 = {9, 7, 5, 3, 1};
        QuickSort.quickSort(arr4, 0, arr4.length - 1);
        int[] expected4 = {1, 3, 5, 7, 9};
        assertArrayEquals(expected4, arr4);
    }
}
