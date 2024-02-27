package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void should_return_true_if_array_contains_duplicate() {
        // given
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] arr = {1, 2, 3, 1};
        // when
        boolean result = containsDuplicate.containsDuplicate(arr);
        // then
        assertTrue(result);

        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void should_return_false_if_array_contains_duplicate() {
        // given
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] arr = {1, 2, 3, 4, 5};
        // when
        boolean result = containsDuplicate.containsDuplicate(arr);
        // then
        assertFalse(result);
    }

}