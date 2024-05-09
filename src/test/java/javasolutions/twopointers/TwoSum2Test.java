package javasolutions.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {

    @Test
    void should_return_proper_indices_using_brute_force() {
        // given
        int[] firstNumbers = new int[]{2, 7, 11, 15};
        int firstTarget = 9;

        int[] secondNumbers = new int[]{2, 3, 4};
        int secondTarget = 6;

        int[] thirdNumbers = new int[]{-1, 0};
        int thirdTarget = -1;

        TwoSum2 twoSum2 = new TwoSum2();
        // when
        int[] firstResult = twoSum2.twoSumBruteForce(firstNumbers, firstTarget);
        int[] secondResult = twoSum2.twoSumBruteForce(secondNumbers, secondTarget);
        int[] thirdResult = twoSum2.twoSumBruteForce(thirdNumbers, thirdTarget);
        // then
        assertAll(
                () -> assertArrayEquals(firstResult, new int[]{1, 2}),
                () -> assertArrayEquals(secondResult, new int[]{1, 3}),
                () -> assertArrayEquals(thirdResult, new int[]{1, 2})
        );
    }

    @Test
    void should_return_proper_indices_using_hashmap() {
        // given
        int[] firstNumbers = new int[]{2, 7, 11, 15};
        int firstTarget = 9;

        int[] secondNumbers = new int[]{2, 3, 4};
        int secondTarget = 6;

        int[] thirdNumbers = new int[]{-1, 0};
        int thirdTarget = -1;

        TwoSum2 twoSum2 = new TwoSum2();
        // when
        int[] firstResult = twoSum2.twoSumHashMap(firstNumbers, firstTarget);
        int[] secondResult = twoSum2.twoSumHashMap(secondNumbers, secondTarget);
        int[] thirdResult = twoSum2.twoSumHashMap(thirdNumbers, thirdTarget);
        // then
        assertAll(
                () -> assertArrayEquals(firstResult, new int[]{1, 2}),
                () -> assertArrayEquals(secondResult, new int[]{1, 3}),
                () -> assertArrayEquals(thirdResult, new int[]{1, 2})
        );
    }

    @Test
    void should_return_proper_indices_using_two_pointers() {
        // given
        int[] firstNumbers = new int[]{2, 7, 11, 15};
        int firstTarget = 9;

        int[] secondNumbers = new int[]{2, 3, 4};
        int secondTarget = 6;

        int[] thirdNumbers = new int[]{-1, 0};
        int thirdTarget = -1;

        TwoSum2 twoSum2 = new TwoSum2();
        // when
        int[] firstResult = twoSum2.twoSumTwoPointers(firstNumbers, firstTarget);
        int[] secondResult = twoSum2.twoSumTwoPointers(secondNumbers, secondTarget);
        int[] thirdResult = twoSum2.twoSumTwoPointers(thirdNumbers, thirdTarget);
        // then
        assertAll(
                () -> assertArrayEquals(firstResult, new int[]{1, 2}),
                () -> assertArrayEquals(secondResult, new int[]{1, 3}),
                () -> assertArrayEquals(thirdResult, new int[]{1, 2})
        );
    }
}