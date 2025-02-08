package ArrayandString;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        boolean[] hasless = new boolean[nums.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            hasless[i] = min < nums[i];
            min = Math.min(min,nums[i]);
        }
        int max = Integer.MIN_VALUE;
        boolean[] hasmore = new boolean[nums.length];
        for (int i = nums.length -1; i >= 0; i--){
            hasmore[i] = max > nums[i];
            max = Math.max(max, nums[i]);
        }

        for (int i = 0 ; i < hasmore.length; i++) {
            if (hasless[i] && hasmore[i]) return true;
        }
        return false;
    }
}
