package kotlinsolutions.arraysandhashing

import javasolutions.LeetCodeTask

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