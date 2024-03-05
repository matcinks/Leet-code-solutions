package kotlinsolutions.arraysandhashing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TopKFrequentElementsTest {

    @Test
    fun should_return_array_with_two_elements() {
        // given
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2;
        val topKFrequentElements = TopKFrequentElements()
        // when
        val firstResult = topKFrequentElements.topKFrequent(nums, k)
        val secondResult = topKFrequentElements.topKFrequentOptimal(nums, k)
        // then
        assertArrayEquals(firstResult, intArrayOf(2, 1))
        assertArrayEquals(secondResult, intArrayOf(1, 2))
    }

    @Test
    fun should_return_array_with_one_element() {
        // given
        val nums = intArrayOf(1)
        val k = 1
        val topKFrequentElements = TopKFrequentElements()
        // when
        val firstResult = topKFrequentElements.topKFrequent(nums, k)
        val secondResult = topKFrequentElements.topKFrequentOptimal(nums, k)
        // then
        assertArrayEquals(firstResult, intArrayOf(1))
        assertArrayEquals(secondResult, intArrayOf(1))
    }

    @Test
    fun should_return_array_with_one_negative_value() {
        // given
        val nums = intArrayOf(-1, -1)
        val k = 1
        val topKFrequentElements = TopKFrequentElements()
        // when
        val firstResult = topKFrequentElements.topKFrequent(nums, k)
        val secondResult = topKFrequentElements.topKFrequentOptimal(nums, k)
        // then
        assertArrayEquals(firstResult, intArrayOf(-1))
        assertArrayEquals(secondResult, intArrayOf(-1))
    }

    @Test
    fun should_return_array_with_two_values() {
        // given
        val nums = intArrayOf(4,1,-1,2,-1,2,3)
        val k = 2
        val topKFrequentElements = TopKFrequentElements()
        // when
        val firstResult = topKFrequentElements.topKFrequent(nums, k)
        val secondResult = topKFrequentElements.topKFrequentOptimal(nums, k)
        // then
        assertArrayEquals(firstResult, intArrayOf(-1, 2))
        assertArrayEquals(secondResult, intArrayOf(-1, 2))
    }
}