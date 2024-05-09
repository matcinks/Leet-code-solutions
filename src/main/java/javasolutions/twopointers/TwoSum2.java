package javasolutions.twopointers;

import javasolutions.LeetCodeTask;

import java.util.HashMap;
import java.util.Map;

/**
 *      Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers
 *      such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
 *      where 1 <= index1 < index2 <= numbers.length.
 *
 *      Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 *      The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 *      Your solution must use only constant extra space.
 *
 *      Example 1:
 *      Input: numbers = [2,7,11,15], target = 9
 *      Output: [1,2]
 *      Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 *
 *      Example 2:
 *      Input: numbers = [2,3,4], target = 6
 *      Output: [1,3]
 *      Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 *
 *      Example 3:
 *      Input: numbers = [-1,0], target = -1
 *      Output: [1,2]
 *      Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSum2 extends LeetCodeTask {

    public TwoSum2() {
        super(167, "Two Sum II - Input Array Is Sorted");
    }

    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumHashMap(int[] numbers, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (store.containsKey(target - numbers[i])) {
                return new int[]{store.get(target - numbers[i]), i + 1};
            }
            store.put(numbers[i], i + 1);
        }
        return new int[0];
    }

    public int[] twoSumTwoPointers(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else if(numbers[l] + numbers[r] < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[0];
    }
}
