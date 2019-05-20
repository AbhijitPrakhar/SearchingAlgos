import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpSearchTest {

    JumpSearch js;
    int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

    @BeforeEach
    void beforeEach() {
        js = new JumpSearch();
    }

    @Test
    void search() {
        assertTrue(js.search(arr, 55));
    }

    @Test
    void searchFail() {
        assertFalse(js.search(arr, 611));
    }

    @Test
    void searchFail2() {
        assertFalse(js.search(arr, 35));
    }
}