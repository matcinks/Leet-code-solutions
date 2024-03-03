package javasolutions.arraysandhashing;

import javasolutions.LeetCodeTask;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 */

public class ProductOfArrayExceptSelf extends LeetCodeTask {

    public ProductOfArrayExceptSelf() {
        super(238, "Product of Array Except Self");
    }

    // this is a simple and naive approach using the "brute force" method, iterating over an array twice which is insufficient based on the example description
    // time complexity in this example is O(n^2) and don't fulfill task requirements
    public int[] productExceptSelfNaiveApproach(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = 1;

            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    val *= nums[j];
                }
            }
            result[i] = val;
        }
        return result;
    }

    // this is a better approach using dedicated tables for prefix and suffix values, and calculating the output
    // the time complexity here is O(3N), and 3 may be omitted, so the final result will be O(n)
    // however memory used in this solution is slightly ineffective and might be improved
    public int[] productExceptSelfUsingThreeArrays(int[] nums) {
        int[] prefixTable = new int[nums.length];
        int[] suffixTable = new int[nums.length];
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefixTable[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            suffixTable[i] = suffix;
            suffix = nums[i] * suffix;
        }

        for (int i = 0; i < nums.length ; i ++) {
            result[i] = prefixTable[i] * suffixTable[i];
        }
        return result;
    }

    // this is more optimal approach using same output array for storing prefix and suffix values
    // time complexity of this approach is O(n)
    public int[] productExceptSelfOptimalSolution(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[]{0};
        }

        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        int suffix = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = nums[i] * suffix;
        }
        return result;
    }


}
