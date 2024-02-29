package kotlinsolutions.arraysandhashing

import kotlinsolutions.LeetCodeTask

/**
 * /**
 *  * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *  * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *  * typically using all the original letters exactly once.
 *  *
 *  * Example 1:
 *  * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *  * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *  *
 *  * Example 2:
 *  * Input: strs = [""]
 *  * Output: [[""]]
 *  *
 *  * Example 3:
 *  * Input: strs = ["a"]
 *  * Output: [["a"]]
 *  */
 */
class GroupAnagrams: LeetCodeTask(49, "Group Anagrams") {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultMap: MutableMap<Int, List<String>> = HashMap()
        for (s in strs) {
            val charsTable = IntArray(26){0}
            for (c in s) {
                charsTable[c - 'a']++
            }
            val hashCode = charsTable.contentHashCode()
            val ss: List<String> = resultMap[hashCode] ?: emptyList()
            resultMap[hashCode] = ss + s
        }
        return resultMap.values.toList()
    }
}