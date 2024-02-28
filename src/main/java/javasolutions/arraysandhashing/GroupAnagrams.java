package javasolutions.arraysandhashing;

import javasolutions.LeetCodeTask;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */

public class GroupAnagrams extends LeetCodeTask {
    public GroupAnagrams() {
        super(49, "Group Anagrams");
    }

    public List<List<String>> groupAnagramsNaiveSolution(String[] strs) {
        Map<List<Character>, List<String>> result = new HashMap<>();
        for (String str : strs) {
            List<Character> tempChar = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                tempChar.add(str.charAt(j));
            }
            Collections.sort(tempChar);
            if (result.containsKey(tempChar)) {
                List<String> tempStr = new ArrayList<>(result.get(tempChar));
                tempStr.add(str);
                result.put(tempChar, tempStr);
            } else {
                result.put(tempChar, List.of(str));
            }
        }
        return result.values().stream().toList();
    }

    public List<List<String>> groupAnagramsOptimalSolution(String[] strs) {
        Map<CountArray, List<String>> resultMap = new HashMap<>();
        for(String s: strs) {
            CountArray countArray = new CountArray();
            for (Character c : s.toCharArray()) {
                countArray.inputCharacterValue(c);
            }
            List<String> tempS = resultMap.getOrDefault(countArray, new ArrayList<>());
            tempS.add(s);
            resultMap.put(countArray, tempS);
        }
        return new ArrayList<>(resultMap.values());
    }

    public List<List<String>> groupAnagramsOptimalSolutionUsingHashValue(String[] strs) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for(String s: strs) {
            int[] countArray = new int[26];
            for (Character c : s.toCharArray()) {
                countArray[c - 'a'] += 1;
            }
            Integer hashValue = Arrays.hashCode(countArray);
            List<String> tempS = resultMap.getOrDefault(hashValue, new ArrayList<>());
            tempS.add(s);
            resultMap.put(hashValue, tempS);
        }
        return new ArrayList<>(resultMap.values());
    }

    private static class CountArray {
        private final int[] countingArray;

        public CountArray() {
            this.countingArray = new int[26];
        }

        public void inputCharacterValue(char c) {
            countingArray[c - 'a']++;
        }

        public int[] getCountingArray() {
            return countingArray.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountArray that = (CountArray) o;
            return Arrays.equals(countingArray, that.countingArray);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(countingArray);
        }

        @Override
        public String toString() {
            return Arrays.toString(countingArray);
        }
    }
}
