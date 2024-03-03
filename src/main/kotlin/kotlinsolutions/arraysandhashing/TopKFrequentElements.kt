package kotlinsolutions.arraysandhashing

import kotlinsolutions.LeetCodeTask

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */

class TopKFrequentElements: LeetCodeTask(347, "Top K Frequent Elements") {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = nums.toList()
            .groupingBy { it }
            .eachCount()
        val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        frequencyMap.forEach{ (k, v) -> buckets[v].add(k) }
        return buckets.flatMap { it }.takeLast(k).toIntArray()
    }
}