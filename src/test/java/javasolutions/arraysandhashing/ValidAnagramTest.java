package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void should_return_true_if_words_are_anagram() {
        // given
        String firstWord = "anagram";
        String secondWord = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        // when
        boolean firstResult = validAnagram.isAnagramUsingArrays(firstWord, secondWord);
        boolean secondResult = validAnagram.isAnagramUsingMap(firstWord, secondWord);
        // then
        assertAll(
                () -> assertTrue(firstResult),
                () -> assertTrue(secondResult)
        );
    }

    @Test
    void should_return_false_if_words_are_not_anagram() {
        // given
        String firstWord = "rat";
        String secondWord = "car";
        ValidAnagram validAnagram = new ValidAnagram();
        // when
        boolean firstResult = validAnagram.isAnagramUsingArrays(firstWord, secondWord);
        boolean secondResult = validAnagram.isAnagramUsingMap(firstWord, secondWord);
        // then
        assertAll(
                () -> assertFalse(firstResult),
                () -> assertFalse(secondResult)
        );
    }
}