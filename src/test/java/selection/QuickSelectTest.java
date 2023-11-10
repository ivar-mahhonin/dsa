package selection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSelectTest {
    @Test
    public void testQuickSelect() {
        int[] arr1 = { 3, 6, 8, 10, 1, 2, 1 };
        int largest1 = QuickSelect.findKthLargest(arr1, 3);
        assertEquals(6, largest1);

        int[] arr2 = { 12, 22, 0, 3, 2, 8 };
        int largest2 = QuickSelect.findKthLargest(arr2, 2);
        assertEquals(12, largest2);

        int[] arr3 = { 5, 0, 23, 12 };
        int largest3 = QuickSelect.findKthLargest(arr3, 1);
        assertEquals(23, largest3);

        int[] arr4 = { 9, 7, 5, 3, 1 };
        int largest4 = QuickSelect.findKthLargest(arr4, 4);
        assertEquals(3, largest4);
    }
}
