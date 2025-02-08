package Easy;

import java.util.*;

class Solution {
    int[] original;
    int[] num_list;

    public Solution(int[] nums) {
        num_list = nums;
        original = nums.clone();
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        Random rand = new Random();
        for (int i = num_list.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Rastgele bir index seç
            // Swap işlemi
            int temp = num_list[i];
            num_list[i] = num_list[j];
            num_list[j] = temp;
        }
        return num_list;
    }
}