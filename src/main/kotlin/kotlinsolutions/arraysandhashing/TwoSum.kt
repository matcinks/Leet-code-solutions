package kotlinsolutions.arraysandhashing

import kotlinsolutions.LeetCodeTask

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 */

class TwoSum : LeetCodeTask(1, "Two Sum") {

    fun twoSumHashMap(nums: IntArray, target: Int): IntArray {
        val valuesMap: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val difference = target - nums[i]
            if (valuesMap.containsKey(difference)) {
                return intArrayOf(valuesMap.getValue(difference), i)
            }
            valuesMap[nums[i]] = i
        }
        return intArrayOf()
    }

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                println("i: $i, j: $j")
                if (target == (nums[i] + nums[j])) return intArrayOf(i, j)}
        }
        return intArrayOf()
    }
}