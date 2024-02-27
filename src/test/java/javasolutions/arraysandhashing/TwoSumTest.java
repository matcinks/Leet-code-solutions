package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void should_return_first_and_second_indices_from_provided_array() {
        // given
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        // when
        int[] firstResult = twoSum.twoSumBruteForce(nums, target);
        int[] secondResult = twoSum.twoSumHashMap(nums, target);
        // then
        assertTrue(Arrays.equals(firstResult, new int[]{0, 1}) || Arrays.equals(firstResult, new int[] {1, 0}));
        assertTrue(Arrays.equals(secondResult, new int[]{0, 1}) || Arrays.equals(secondResult, new int[] {1, 0}));
    }

    @Test
    void should_return_second_and_third_indices_from_provided_array() {
        // given
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        // when
        int[] firstResult = twoSum.twoSumBruteForce(nums, target);
        int[] secondResult = twoSum.twoSumHashMap(nums, target);
        // then
        assertTrue(Arrays.equals(firstResult, new int[]{1, 2}) || Arrays.equals(firstResult, new int[] {2, 1}));
        assertTrue(Arrays.equals(secondResult, new int[]{1, 2}) || Arrays.equals(secondResult, new int[] {2, 1}));
    }

    @Test
    void should_return_first_and_second_indices_from_provided_two_elements_array() {
        // given
        int[] nums = new int[]{3, 3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        // when
        int[] firstResult = twoSum.twoSumBruteForce(nums, target);
        int[] secondResult = twoSum.twoSumHashMap(nums, target);
        // then
        assertTrue(Arrays.equals(firstResult, new int[]{0, 1}) || Arrays.equals(firstResult, new int[] {1, 0}));
        assertTrue(Arrays.equals(secondResult, new int[]{0, 1}) || Arrays.equals(secondResult, new int[] {1, 0}));
    }
}