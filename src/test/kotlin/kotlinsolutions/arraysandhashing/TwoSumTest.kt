package kotlinsolutions.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun should_return_first_and_second_indices_from_provided_array() {
        // given
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val twoSum = TwoSum()
        // when
        val firstResult = twoSum.twoSumHashMap(nums, target)
        val second = twoSum.twoSumBruteForce(nums, target)
        // then
        Assertions.assertTrue(firstResult.contentEquals(intArrayOf(0, 1)) || firstResult.contentEquals(intArrayOf(1, 0)))
        Assertions.assertTrue(second.contentEquals(intArrayOf(0, 1)) || second.contentEquals(intArrayOf(1, 0)))
    }

    @Test
    fun should_return_second_and_third_indices_from_provided_array() {
        // given
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val twoSum = TwoSum()
        // when
        val firstResult = twoSum.twoSumHashMap(nums, target)
        val secondResult = twoSum.twoSumBruteForce(nums, target)
        // then
        Assertions.assertTrue(firstResult.contentEquals(intArrayOf(1, 2)) || firstResult.contentEquals(intArrayOf(2, 1)))
        Assertions.assertTrue(secondResult.contentEquals(intArrayOf(1, 2)) || secondResult.contentEquals(intArrayOf(2, 1)))
    }

    @Test
    fun should_return_first_and_second_indices_from_provided_two_elements_array() {
        // given
        val nums = intArrayOf(3, 3)
        val target = 6
        val twoSum = TwoSum()
        // when
        val firstResult = twoSum.twoSumHashMap(nums, target)
        val secondResult = twoSum.twoSumBruteForce(nums, target)
        // then
        Assertions.assertTrue(firstResult.contentEquals(intArrayOf(0, 1)) || firstResult.contentEquals(intArrayOf(1, 0)))
        Assertions.assertTrue(secondResult.contentEquals(intArrayOf(0, 1)) || secondResult.contentEquals(intArrayOf(1, 0)))
    }
}