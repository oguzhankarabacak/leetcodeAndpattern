package Easy;

import java.util.*;

public class Array {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }

        }
        return profit;
    }
    public void rotate(int[] nums, int k) {
        if (nums.length < k) k = k % nums.length;
        int[] rotatedNums = new int[k];
        int counter = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            rotatedNums[counter] = nums[i];
            counter += 1;
        }
        for (int i = nums.length - k - 1; i >= 0 ; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = rotatedNums[i];
        }
    }
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = freq.getOrDefault(nums[i],0) + 1;
            if (num > 1) return true;
            freq.put(nums[i], num);
        }
        return false;
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num: nums) result ^= num;
        return result;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i += 1;
                j += 1;
            }
            else if (nums1[i] > nums2[j]) {
                j += 1;
            }
            else {
                i += 1;
            }
        }
        int[] resultArr = new int[result.size()];
        for (int k = 0; k < result.size(); k++) resultArr[k] = result.get(k);
        return resultArr;

    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += 1;
                break;
            }
        }

        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;

        }
        return digits;
    }
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroIndex] = nums[i];
                zeroIndex += 1;
            }
            else {
                zeroCounter += 1;
            }
        }
        for (int i = nums.length - zeroCounter; i < nums.length; i++) nums[i] = 0;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexNeedNumber = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int index = indexNeedNumber.getOrDefault(target-nums[i], -1);
            if (index != -1) {
                result[1] = i;
                result[0] = index;
                break;
            }
            indexNeedNumber.put(nums[i],i);

        }
        return result;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean result = true;

        for (int i = 0; i < board.length; i++) {
            List<Character> characterList = new ArrayList<>();
            for (int j = 0; j < board[0].length; j++) {
                if (characterList.contains(board[i][j])) {
                    return false;
                }
                if ((board[i][j] != '.')) characterList.add(board[i][j]);
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            List<Character> characterList = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                if (characterList.contains(board[j][i])) {
                    return false;
                }
                if ((board[j][i] != '.')) characterList.add(board[j][i]);
            }
        }
        int[][] directions = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
        for (int i = 1; i < board.length; i += 3 ) {
            for (int j = 1; j < board.length; j+= 3) {
                List<Character> characterList = new ArrayList<>();
                for (int[] direct : directions) {
                    int directX = direct[0];
                    int directY = direct[1];
                    if (characterList.contains(board[i + directX][j + directY])) {
                        return false;
                    }
                    if ((board[i + directX][j + directY] != '.')) characterList.add(board[i + directX][j + directY]);
                }
            }

        }

        return true;

    }
    public void rotate(int[][] matrix) {
        List<List<Integer>> missingValues = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

            }
        }
    }

    public static void main(String[] args) {
        Array array = new Array();

        /*
        int[] nums = {7,1,5,3,6,4};
        int result = array.maxProfit(nums);
        System.out.println(result);


        int[] nums = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        array.rotate(nums2, 2);
        for (int i: nums2) {
            System.out.println(i);
        }
        int[] nums = {3,3};
        boolean result = array.containsDuplicate(nums);
        System.out.println(result);



        int[] nums = {4,1,2,2,1};
        int result = array.singleNumber(nums);
        System.out.println(result);

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = array.intersect(nums1, nums2);
        for(int i: result) {
            System.out.println(i);
        }

        int[] nums = {1,2,3,4};
        int[] nums2 = {1,2,3,9};
        int[] nums3 = {1,2,9,9};
        int[] nums4 = {9,9,9,9};
        int[] result = array.plusOne(nums2);
        for(int i: result) System.out.println(i);

        int[] nums = {0,1};
        array.moveZeroes(nums);
        for (int i : nums) System.out.println(i);

        int[] nums = {3,2,4};
        int[] result = array.twoSum(nums,6);
        System.out.println(result[0] + " " + result[1]);

         */
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean result = array.isValidSudoku(board);
        System.out.println(result);
    }
}
