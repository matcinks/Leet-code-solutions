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
        val result = topKFrequentElements.topKFrequent(nums, k)
        // then
        assertArrayEquals(result, intArrayOf(2, 1))
    }

    @Test
    fun should_return_array_with_one_element() {
        // given
        val nums = intArrayOf(1)
        val k = 1
        val topKFrequentElements = TopKFrequentElements()
        // when
        val result = topKFrequentElements.topKFrequent(nums, k)
        // then
        assertArrayEquals(result, intArrayOf(1))
    }

}