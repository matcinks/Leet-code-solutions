package javasolutions.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidPalindromeTest {

    private final String firstPalindromePhrase = "A man, a plan, a canal: Panama";
    private final String noPalindromePhrase = "race a car";
    private final String secondPalindromePhrase = " ";

    @Test
    void should_return_true_if_given_phrase_is_palindrome_using_regex_and_reverse_method() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean firstResult = validPalindrome.isPalindromeUsingRegexAndReverseMethod(firstPalindromePhrase);
        boolean secondResult = validPalindrome.isPalindromeUsingRegexAndReverseMethod(secondPalindromePhrase);
        // then
        assertAll(
                () -> assertThat(firstResult).isTrue(),
                () -> assertThat(secondResult).isTrue()
        );
    }

    @Test
    void should_return_false_if_given_phrase_is_not_palindrome_using_regex_and_reverse_method() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean result = validPalindrome.isPalindromeUsingRegexAndReverseMethod(noPalindromePhrase);
        // then
        assertFalse(result);
    }

    @Test
    void should_return_true_if_given_phrase_is_palindrome_using_two_pointers() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean firstResult = validPalindrome.isPalindromeUsingTwoPointers(firstPalindromePhrase);
        boolean secondResult = validPalindrome.isPalindromeUsingTwoPointers(secondPalindromePhrase);
        // then
        assertAll(
                () -> assertThat(firstResult).isTrue(),
                () -> assertThat(secondResult).isTrue()
        );
    }

    @Test
    void should_return_false_if_given_phrase_is_not_palindrome_using_two_pointers() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean result = validPalindrome.isPalindromeUsingTwoPointers(noPalindromePhrase);
        // then
        assertFalse(result);
    }

    @Test
    void should_return_true_if_given_phrase_is_palindrome_using_combination_of_regex_and_two_pointers() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean firstResult = validPalindrome.isPalindromeUsingCombinationOfRegexAndTwoPointers(firstPalindromePhrase);
        boolean secondResult = validPalindrome.isPalindromeUsingCombinationOfRegexAndTwoPointers(secondPalindromePhrase);
        // then
        assertAll(
                () -> assertThat(firstResult).isTrue(),
                () -> assertThat(secondResult).isTrue()
        );
    }

    @Test
    void should_return_false_if_given_phrase_is_not_palindrome_using_combination_of_regex_and_two_pointers() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean result = validPalindrome.isPalindromeUsingCombinationOfRegexAndTwoPointers(noPalindromePhrase);
        // then
        assertFalse(result);
    }
}