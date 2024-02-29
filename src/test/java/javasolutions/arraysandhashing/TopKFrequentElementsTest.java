package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void should_return_array_with_two_elements() {
        // given
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        // when
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        // then
        assertArrayEquals(result, new int[]{1, 2});
    }

    @Test
    void should_return_array_with_one_element() {
        // given
        int[] nums = new int[]{1};
        int k = 1;
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        // when
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        // then
        assertArrayEquals(result, new int[]{1});
    }

}