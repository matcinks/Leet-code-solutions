package kotlinsolutions.arraysandhashing

import kotlinsolutions.LeetCodeTask
import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.HashMap

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

class TopKFrequentElements : LeetCodeTask(347, "Top K Frequent Elements") {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = nums.toList()
            .groupingBy { it }
            .eachCount()
        val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        frequencyMap.forEach { (k, v) -> buckets[v].add(k) }
        return buckets.flatMap { it }.takeLast(k).toIntArray()
    }

    fun topKFrequentOptimal(nums: IntArray, k: Int): IntArray {
        val frequencyArray: HashMap<Int, Int> = HashMap()
        val bucket = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        val result = mutableListOf<Int>()

        nums.forEach {
            val count = frequencyArray.getOrDefault(it, 0)
            frequencyArray[it] = count + 1
        }
        frequencyArray.forEach { (key, value) ->
            bucket[value].add(key)
        }
        var remainingElements = k
        for (index in bucket.size - 1 downTo 0) {
            if (remainingElements <= 0) {
                break
            }
            if (bucket[index].isNotEmpty()) {
                val elementsToAdd = minOf(remainingElements, bucket[index].size)
                result.addAll(bucket[index].take(elementsToAdd))
                remainingElements -= elementsToAdd
            }
        }
        return result.toIntArray()
    }
}