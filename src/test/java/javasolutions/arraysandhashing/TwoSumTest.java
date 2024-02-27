package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void should_return_first_and_second_indices_from_provided_array() {
        // given
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        // when
        int[] result = twoSum.twoSum(nums, target);
        // then
        assertEquals(result, new int[] {0, 1});
    }

    @Disabled
    @Test
    void should_return_second_and_third_indices_from_provided_array() {
        // given
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        // when
        int[] result = twoSum.twoSum(nums, target);
        // then
        assertEquals(result, new int[] {1, 2});
    }

    @Disabled
    @Test
    void should_return_first_and_second_indices_from_provided_two_elements_array() {
        // given
        int[] nums = new int[]{3, 3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        // when
        int[] result = twoSum.twoSum(nums, target);
        // then
        assertEquals(result, new int[] {0, 1});
    }
}