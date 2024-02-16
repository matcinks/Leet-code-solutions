package javasolutions.arraysandhashing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    public void testHasDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
    }

}