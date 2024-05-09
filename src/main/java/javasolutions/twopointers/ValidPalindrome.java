package javasolutions.twopointers;

import javasolutions.LeetCodeTask;

/**
 *
 *      A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 *      and removing all non-alphanumeric characters, it reads the same forward and backward.
 *      Alphanumeric characters include letters and numbers.
 *
 *      Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *      Example 1:
 *      Input: s = "A man, a plan, a canal: Panama"
 *      Output: true
 *      Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 *      Example 2:
 *      Input: s = "race a car"
 *      Output: false
 *      Explanation: "raceacar" is not a palindrome.
 *
 *      Example 3:
 *      Input: s = " "
 *      Output: true
 *      Explanation: s is an empty string "" after removing non-alphanumeric characters.
 *      Since an empty string reads the same forward and backward, it is a palindrome.
 *
 */

public class ValidPalindrome extends LeetCodeTask {

    public ValidPalindrome() {
        super(125, "Valid Palindrome");
    }

    public boolean isPalindromeUsingRegexAndReverseMethod(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(actual).reverse().toString();
        return actual.equals(reversed);
    }

    public boolean isPalindromeUsingTwoPointers(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (l > r || (Character.toLowerCase(s.charAt(l))) != Character.toLowerCase(s.charAt(r))) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public boolean isPalindromeUsingCombinationOfRegexAndTwoPointers(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int l = 0;
        int r = actual.length() - 1;
        while (l < r) {
            if (actual.charAt(l) != actual.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}
