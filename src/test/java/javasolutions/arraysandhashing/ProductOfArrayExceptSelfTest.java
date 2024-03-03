package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void should_return_correct_array_first_example() {
        // given
        int[] nums = new int[]{1, 2, 3, 4};
        // when
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] firstResult = productOfArrayExceptSelf.productExceptSelfNaiveApproach(nums);
        int[] secondResult = productOfArrayExceptSelf.productExceptSelfUsingThreeArrays(nums);
        int[] thirdResult = productOfArrayExceptSelf.productExceptSelfOptimalSolution(nums);
        // then
        assertArrayEquals(firstResult, new int[]{24, 12, 8, 6});
        assertArrayEquals(secondResult, new int[]{24, 12, 8, 6});
        assertArrayEquals(thirdResult, new int[]{24, 12, 8, 6});
    }

    @Test
    void should_return_correct_array_second_example() {
        // given
        int[] nums = new int[]{-1, 1, 0, -3, 3};
        // when
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] firstResult = productOfArrayExceptSelf.productExceptSelfNaiveApproach(nums);
        int[] secondResult = productOfArrayExceptSelf.productExceptSelfUsingThreeArrays(nums);
        int[] thirdResult = productOfArrayExceptSelf.productExceptSelfOptimalSolution(nums);
        // then
        assertArrayEquals(firstResult, new int[]{0, 0, 9, 0, 0});
        assertArrayEquals(secondResult, new int[]{0, 0, 9, 0, 0});
        assertArrayEquals(thirdResult, new int[]{0, 0, 9, 0, 0});
    }

}