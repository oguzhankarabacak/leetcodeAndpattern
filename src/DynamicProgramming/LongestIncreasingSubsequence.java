package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] max_sequence = new int[nums.length];
        Arrays.fill(max_sequence,1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max_sequence[i] = Math.max(max_sequence[j]+1,max_sequence[i]);
                    if (max_sequence[i] > max) max = max_sequence[i];
                }
            }
        }
        return max;
    }
}
