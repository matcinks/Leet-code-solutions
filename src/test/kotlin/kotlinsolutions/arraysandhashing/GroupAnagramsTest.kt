package kotlinsolutions.arraysandhashing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupAnagramsTest{

    @Test
    fun should_return_three_lists_of_anagrams() {
        // given
        val strs: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val groupAnagrams = GroupAnagrams()
        // when
        val result = groupAnagrams.groupAnagrams(strs)
        // then
        val expected = listOf(
                listOf("nat", "tan"),
        listOf("bat"),
        listOf("ate", "eat", "tea")
        )
        val actualHash: MutableSet<Int> = HashSet()
        val expectedHash: MutableSet<Int> = HashSet()
        for (s in result) {
            actualHash.plus(setOf(s.hashCode()))
            expectedHash.plus(setOf(expected.hashCode()))
        }
        assertThat(actualHash).hasSameHashCodeAs(expectedHash)
    }

    @Test
    fun should_return_empty_list() {
        // given
        val strs: Array<String> = arrayOf("")
        val groupAnagrams = GroupAnagrams();
        // when
        val result = groupAnagrams.groupAnagrams(strs)
        // then
        assertThat(result).containsExactly(
            arrayListOf("")
        );
    }
    @Test
    fun should_return_list_with_single_character() {
        // given
        val strs: Array<String> = arrayOf("a")
        val groupAnagrams = GroupAnagrams()
        // when
        val result = groupAnagrams.groupAnagrams(strs)
        // then
        assertThat(result).containsExactly(
            arrayListOf("a")
        )
    }

    @Test
    fun should_return_list_with_two_separate_objects() {
        // given
        val strs: Array<String> = arrayOf("a")
        val groupAnagrams = GroupAnagrams()
        // when
        val result = groupAnagrams.groupAnagrams(strs)
        // then
        assertThat(result).containsExactlyInAnyOrder(
           arrayListOf("dgggggggggg"),
            arrayListOf("ddddddddddg")
        )
    }

}