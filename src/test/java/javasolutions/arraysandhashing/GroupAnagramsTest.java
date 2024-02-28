package javasolutions.arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    @Test
    void should_return_three_lists_of_anagrams() {
        // given
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> firstResult = groupAnagrams.groupAnagramsNaiveSolution(strs);
        List<List<String>> secondResult = groupAnagrams.groupAnagramsOptimalSolution(strs);
        List<List<String>> thirdResult = groupAnagrams.groupAnagramsOptimalSolutionUsingHashValue(strs);
        // then
        List<List<String>> expected = List.of(
                List.of("nat", "tan"),
                List.of("bat"),
                List.of("ate", "eat", "tea")
        );

        Set<Integer> firstActualHash = new HashSet<>();
        Set<Integer> secondActualHash = new HashSet<>();
        Set<Integer> thirdActualHash = new HashSet<>();
        Set<Integer> expectedHash = new HashSet<>();

        for (int i = 0; i < firstResult.size(); i++) {
            firstActualHash.add(new HashSet<>(firstResult.get(i)).hashCode());
            secondActualHash.add(new HashSet<>(secondResult.get(i)).hashCode());
            thirdActualHash.add(new HashSet<>(thirdResult.get(i)).hashCode());
            expectedHash.add(new HashSet<>(expected.get(i)).hashCode());
        }

        assertThat(firstActualHash).hasSameHashCodeAs(expectedHash);
        assertThat(secondActualHash).hasSameHashCodeAs(expectedHash);
        assertThat(thirdActualHash).hasSameHashCodeAs(expectedHash);
    }

    @Test
    void should_return_empty_list() {
        // given
        String[] strs = {""};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> firstResult = groupAnagrams.groupAnagramsNaiveSolution(strs);
        List<List<String>> secondResult = groupAnagrams.groupAnagramsOptimalSolution(strs);
        List<List<String>> thirdResult = groupAnagrams.groupAnagramsOptimalSolutionUsingHashValue(strs);
        // then
        assertThat(firstResult).containsExactly(
                List.of("")
        );
        assertThat(secondResult).containsExactly(
                List.of("")
        );
        assertThat(thirdResult).containsExactly(
                List.of("")
        );
    }
    @Test
    void should_return_list_with_single_character() {
        // given
        String[] strs = {"a"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> firstResult = groupAnagrams.groupAnagramsNaiveSolution(strs);
        List<List<String>> secondResult = groupAnagrams.groupAnagramsOptimalSolution(strs);
        List<List<String>> thirdResult = groupAnagrams.groupAnagramsOptimalSolutionUsingHashValue(strs);
        // then
        assertThat(firstResult).containsExactly(
                List.of("a")
        );
        assertThat(secondResult).containsExactly(
                List.of("a")
        );
        assertThat(thirdResult).containsExactly(
                List.of("a")
        );
    }

    @Test
    void should_return_list_with_two_separate_objects() {
        // given
        String[] strs = {"ddddddddddg","dgggggggggg"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> firstResult = groupAnagrams.groupAnagramsNaiveSolution(strs);
        List<List<String>> secondResult = groupAnagrams.groupAnagramsOptimalSolution(strs);
        List<List<String>> thirdResult = groupAnagrams.groupAnagramsOptimalSolutionUsingHashValue(strs);
        // then
        assertThat(firstResult).containsExactlyInAnyOrder(
                List.of("dgggggggggg"),
                List.of("ddddddddddg")
        );
        assertThat(secondResult).containsExactlyInAnyOrder(
                List.of("dgggggggggg"),
                List.of("ddddddddddg")
        );
        assertThat(thirdResult).containsExactlyInAnyOrder(
                List.of("dgggggggggg"),
                List.of("ddddddddddg")
        );
    }
}