package kotlinsolutions.arraysandhashing

import kotlinsolutions.LeetCodeTask
import kotlin.collections.HashMap

/**
 *  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *  typically using all the original letters exactly once.
 *
 *  Example 1:
 *  Input: s = "anagram", t = "nagaram"
 *  Output: true
 *
 *  Example 2:
 *  Input: s = "rat", t = "car"
 *  Output: false
 */

class ValidAnagram : LeetCodeTask(242, "Valid Anagram") {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val first: String = s.toCharArray().sortedArray().concatToString()
        val second: String = t.toCharArray().sortedArray().concatToString()
        return first == second
    }

    fun isAnagramInOneLine(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())
    }

    fun isAnagramUsingHashMap(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val countingMap = HashMap<Char, Int>()
        s.forEach { countingMap[it] = countingMap.getOrDefault(it, 0) + 1 }
        t.forEach { countingMap[it] = countingMap.getOrDefault(it, 0) - 1 }
        countingMap.forEach { if(it.value != 0) return false}
        return true
    }

    fun isAnagramUsingArray(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val FIRST_LETTER: Int = 97
        val arr = IntArray(26) { i -> 0 }
        for ((cInS, cInT) in s zip t) {
            ++arr[cInS.code - FIRST_LETTER]
            --arr[cInT.code - FIRST_LETTER]
        }
        for (c in arr) {
            if (c != 0) return false
        }
        return true
    }

    fun isAnagramUsingArraySimplified(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = Array(26){0}
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }
        return arr.all { it == 0 }
    }
}