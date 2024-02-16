package kotlinsolutions.arraysandhashing

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class ContainsDuplicateTest {

    @Test
    fun should_return_true_when_numbers_array_contain_duplicates() {
        // given
        val containsDuplicate = ContainsDuplicate()
        val numbers = intArrayOf(1, 2, 3, 1)
        // when
        val firstResult = containsDuplicate.containsDuplicate(numbers)
        val secondResult = containsDuplicate.containsDuplicateUsingComparison(numbers)
        val thirdResult = containsDuplicate.containsDuplicateUsingAddition(numbers)
        // then
        Assertions.assertAll(
            { Assertions.assertTrue(firstResult) },
            { Assertions.assertTrue(secondResult) },
            { Assertions.assertTrue(thirdResult) },
        )
    }

    @Test
    fun should_return_false_when_numbers_array_contain_duplicates() {
        // given
        val containsDuplicate = ContainsDuplicate()
        val numbers = intArrayOf(1, 2, 3, 4)
        // when
        val firstResult = containsDuplicate.containsDuplicate(numbers)
        val secondResult = containsDuplicate.containsDuplicateUsingComparison(numbers)
        val thirdResult = containsDuplicate.containsDuplicateUsingAddition(numbers)
        // then
        Assertions.assertAll(
            { Assertions.assertFalse(firstResult) },
            { Assertions.assertFalse(secondResult) },
            { Assertions.assertFalse(thirdResult) },
        )
    }
}