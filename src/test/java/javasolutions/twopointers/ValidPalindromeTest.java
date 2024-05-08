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
    void should_return_true_if_given_phrase_is_palindrome() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean firstResult = validPalindrome.isPalindrome(firstPalindromePhrase);
        boolean secondResult = validPalindrome.isPalindrome(secondPalindromePhrase);
        // then
        assertAll(
                () -> assertThat(firstResult).isTrue(),
                () -> assertThat(secondResult).isTrue()
        );
    }

    @Test
    void should_return_false_if_given_phrase_is_not_palindrome() {
        // given
        ValidPalindrome validPalindrome = new ValidPalindrome();
        // when
        boolean result = validPalindrome.isPalindrome(noPalindromePhrase);
        // then
        assertFalse(result);
    }
}