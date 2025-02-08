package Easy;

public class Dynamic {
    public int climbStairs(int n) {
        int[] howManyList = new int[n+1];
        howManyList[0] = 1;
        howManyList[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            howManyList[i] = howManyList[i-2] + howManyList[i-1];
        }
        return howManyList[howManyList.length - 1];
    }
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        int minimumPrices = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - minimumPrices, profit);
            if (minimumPrices > prices[i]) {
                minimumPrices = prices[i];
            }
        }
        return profit;
    }
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int largestSum = nums[0];
        int currentSum = largestSum;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) currentSum = nums[i];
            else currentSum = currentSum + nums[i];
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }
        return largestSum;
    }
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;
        int prev1 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1,prev2 + nums[i]);
            prev2 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Dynamic dynamic = new Dynamic();

        //System.out.println(dynamic.climbStairs(5));

        //int[] list = {7,1,5,3,6,4};
        //System.out.println(dynamic.maxProfit(list));

        int[] list = {2,7,9,3,1};
        int[] list2 = {1,2,3,1};
        int[] list3 = {2,1};
        int[] list4 = {2,1,1,2};
        System.out.println(dynamic.rob(list));
    }
}