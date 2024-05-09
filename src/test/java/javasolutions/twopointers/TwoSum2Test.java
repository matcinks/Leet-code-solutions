package javasolutions.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {

    @Test
    void should_return_proper_indices() {
        // given
        int[] firstNumbers = new int[]{2, 7, 11, 15};
        int firstTarget = 9;

        int[] secondNumbers = new int[]{2, 3, 4};
        int secondTarget = 6;

        int[] thirdNumbers = new int[]{-1, 0};
        int thirdTarget = -1;

        TwoSum2 twoSum2 = new TwoSum2();
        // when
        int[] firstResult = twoSum2.twoSum(firstNumbers, firstTarget);
        int[] secondResult = twoSum2.twoSum(secondNumbers, secondTarget);
        int[] thirdResult = twoSum2.twoSum(thirdNumbers, thirdTarget);
        // then
        assertAll(
                () -> assertArrayEquals(firstResult, new int[]{1, 2}),
                () -> assertArrayEquals(secondResult, new int[]{1, 3}),
                () -> assertArrayEquals(thirdResult, new int[]{1, 2})
        );
    }
}