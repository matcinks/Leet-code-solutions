package kotlinsolutions.arraysandhashing

import javasolutions.LeetCodeTask

/**
 *  Given an integer array nums,
 *  return true if any value appears at least twice in the array,
 *  and return false if every element is distinct.
 *
 *  Example 1:
 *  Input: nums = [1,2,3,1]
 *  Output: true
 *
 *  Example 2:
 *  Input: nums = [1,2,3,4]
 *  Output: false
 *
 *  Example 3:
 *  Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *  Output: true
 */

class ContainsDuplicate : LeetCodeTask(217, "Contains Duplicate") {

    fun containsDuplicate(nums: IntArray): Boolean {
        val dummySet = HashSet<Int>()
        nums.forEach {
            if (dummySet.contains(it)) return true
            dummySet.add(it)
        }
        return false
    }

    fun containsDuplicateUsingComparison(nums: IntArray): Boolean {
        return nums.size > nums.toSet().size
    }

    fun containsDuplicateUsingAddition(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (num in nums)
            if (!seen.add(num))
                return true
        return false
    }
}