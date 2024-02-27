package javasolutions.arraysandhashing;

import javasolutions.LeetCodeTask;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum extends LeetCodeTask {

    public TwoSum() {
        super(1, "Two Sum");
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> mapOfVisitedElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (mapOfVisitedElements.containsKey(difference)) {
                return new int[]{i, mapOfVisitedElements.get(difference)};
            }
            mapOfVisitedElements.put(nums[i], i);
        }
        return null;
    }
}
