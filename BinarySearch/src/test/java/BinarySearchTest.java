import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch bs;
    int arr[] = { 2, 3, 4, 10, 40 };

    @BeforeEach
    void beforeEach() {
        bs = new BinarySearch();
    }

    @Test
    void searchPass() {
        Assumptions.assumeTrue(arr != null);
        assertTrue(bs.search(arr, 10));
    }

    @Test
    void searchFail() {
        Assumptions.assumeTrue(arr != null);
        assertFalse(bs.search(arr, 5));
    }

    @Test
    void searchSkip() {
        Assumptions.assumeTrue(arr == null);
        assertFalse(bs.search(arr, 10));
    }
}