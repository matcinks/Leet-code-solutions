package javasolutions.arraysandhashing;

import com.sun.source.tree.Tree;
import javasolutions.LeetCodeTask;

import java.util.*;

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

public class TopKFrequentElements extends LeetCodeTask {

    public TopKFrequentElements() {
        super(347, "Top K Frequent Elements");
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> calcMap = new HashMap<>();
        List<Integer>[] appearancesBucket = new ArrayList[nums.length + 1];
        int[] result = new int[k];

        for (int n : nums) {
            calcMap.put(n, calcMap.getOrDefault(n, 0) + 1);
        }

        for (int key : calcMap.keySet()) {
            int freq = calcMap.get(key);
            if(appearancesBucket[freq] == null) {
                appearancesBucket[freq] = new ArrayList<>();
            }
            appearancesBucket[freq].add(key);
        }

        for (int i = nums.length, counter = 0; i>=0 && counter < k; i--) {
            if (appearancesBucket[i] != null) {
                for (int val: appearancesBucket[i]) {
                    result[counter++] = val;
                }
            }
        }
        return result;
    }
}
