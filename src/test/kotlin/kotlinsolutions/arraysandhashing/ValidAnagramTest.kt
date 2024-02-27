package kotlinsolutions.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    @Test
    fun should_return_true_if_words_are_anagram() {
        // given
        val firstWord = "anagram"
        val secondWord = "nagaram"
        val validAnagram = ValidAnagram()
        // when
        val firstResult = validAnagram.isAnagram(firstWord, secondWord)
        val secondResult = validAnagram.isAnagramInOneLine(firstWord, secondWord)
        val thirdResult = validAnagram.isAnagramUsingHashMap(firstWord, secondWord)
        val fourthResult = validAnagram.isAnagramUsingArray(firstWord,secondWord)
        val fifthResult = validAnagram.isAnagramUsingArraySimplified(firstWord,secondWord)
        // then
        Assertions.assertAll(
            {Assertions.assertTrue(firstResult)},
            {Assertions.assertTrue(secondResult)},
            {Assertions.assertTrue(thirdResult)},
            {Assertions.assertTrue(fourthResult)},
            {Assertions.assertTrue(fifthResult)},
        )
    }

    @Test
    fun should_return_false_if_words_are_not_anagram() {
        // given
        val firstWord = "rat"
        val secondWord = "car"
        val validAnagram = ValidAnagram()
        // when
        val firstResult = validAnagram.isAnagram(firstWord, secondWord)
        val secondResult = validAnagram.isAnagramInOneLine(firstWord, secondWord)
        val thirdResult = validAnagram.isAnagramUsingHashMap(firstWord, secondWord)
        val fourthResult = validAnagram.isAnagramUsingArray(firstWord,secondWord)
        val fifthResult = validAnagram.isAnagramUsingArraySimplified(firstWord,secondWord)
        // then
        Assertions.assertAll(
            {Assertions.assertFalse(firstResult)},
            {Assertions.assertFalse(secondResult)},
            {Assertions.assertFalse(thirdResult)},
            {Assertions.assertFalse(fourthResult)},
            {Assertions.assertFalse(fifthResult)},
        )
    }

}