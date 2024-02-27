package javasolutions.arraysandhashing;

import javasolutions.LeetCodeTask;

import java.util.*;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class ValidAnagram extends LeetCodeTask {

    public ValidAnagram() {
        super(242, "Valid Anagram");
    }

    public boolean isAnagramUsingArrays(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] firstWordCharacters = s.toCharArray();
        char[] secondWordCharacters = t.toCharArray();
        Arrays.sort(firstWordCharacters);
        Arrays.sort(secondWordCharacters);
        return Arrays.equals(firstWordCharacters, secondWordCharacters);
    }

    public boolean isAnagramUsingMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> countingMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countingMap.put(c, countingMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            countingMap.put(c, countingMap.getOrDefault(c, 0) - 1);
        }
        for (int val : countingMap.values()) {
            if (val != 0) return false;
        }
        return true;
    }
}
