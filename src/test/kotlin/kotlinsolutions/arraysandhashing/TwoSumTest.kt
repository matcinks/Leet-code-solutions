package kotlinsolutions.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun should_return_first_and_second_indices_from_provided_array() {
        // given
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val twoSum = TwoSum()
        // when
        val result = twoSum.twoSum(nums, target)
        // then
        Assertions.assertEquals(result, intArrayOf(0, 1))
    }

    @Disabled
    @Test
    fun should_return_second_and_third_indices_from_provided_array() {
        // given
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val twoSum = TwoSum()
        // when
        val result = twoSum.twoSum(nums, target);
        // then
        Assertions.assertEquals(result, intArrayOf(1, 2))
    }

    @Disabled
    @Test
    fun should_return_first_and_second_indices_from_provided_two_elements_array() {
        // given
        val nums = intArrayOf(3, 3)
        val target = 6
        val twoSum = TwoSum()
        // when
        val result = twoSum.twoSum(nums, target)
        // then
        Assertions.assertEquals(result, intArrayOf(0, 1))
    }
}