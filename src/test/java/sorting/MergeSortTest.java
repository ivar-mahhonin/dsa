package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testMergeSortWithMixedElements() {
        int[] arr = { 1, 1, 2, 3, 6, 8, 10, 1, 2, 13, 22 };
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = { 1, 1, 1, 2, 2, 3, 6, 8, 10, 13, 22 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithSortedElements() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithReverseSortedElements() {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithIdenticalElements() {
        int[] arr = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithSingleElement() {
        int[] arr = { 1 };
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = { 1 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] arr = {};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }
}
