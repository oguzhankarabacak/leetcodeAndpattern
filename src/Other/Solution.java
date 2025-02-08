package Other;

import java.util.*;

public class Solution {
    public int getSum(int a, int b) {
        return 0;
    }

    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int counter = 0;
        while (counter < tokens.length) {
            String value = tokens[counter];
            if (value.equals("+")) {
                stack.add(stack.pop() + stack.pop());

            }
            else if (value.equals("-")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.add(second - first);
            }
            else if (value.equals("*")) {
                stack.add(stack.pop() * stack.pop());
            }
            else if (value.equals("/")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.add(second / first);
            }
            else {
                int number = Integer.valueOf(value);
                stack.add(number);
            }
            counter += 1;
        }
        return stack.pop();
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 0) return 0;
        int counter = 1;
        int candidate = nums[0];
        for(int i = 1; i < nums.length ; i++) {
            if (nums[i] == candidate) counter += 1;
            else counter -= 1;
            if (counter == 0) {
                candidate = nums[i];
                counter = 1;

            }
        }
        return candidate;
    }

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char task : tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
        }

        // Max Heap: En yüksek frekanslı görevi önce almak için
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freqMap.values());

        Queue<int[]> cooldownQueue = new LinkedList<>();
        int time = 0;

        while (!maxHeap.isEmpty() || !cooldownQueue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int remaining = maxHeap.poll() - 1; // Görevi işle ve bir azalt
                if (remaining > 0) {
                    cooldownQueue.offer(new int[]{remaining, time + n}); // Cooldown kuyruğuna ekle
                }
            }

            // Cooldown süresi dolan görevleri tekrar ekle
            if (!cooldownQueue.isEmpty() && cooldownQueue.peek()[1] == time) {
                maxHeap.offer(cooldownQueue.poll()[0]);
            }
        }

        return time;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        /*
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result = solution.evalRPN(tokens);
        System.out.println(result);

        int[] nums = {3,2,3};
        int result_majority = solution.majorityElement(nums);
        System.out.println(result_majority);

         */

        char[] tasks = {'A','A','A', 'B','B','B'};
        char[] tasks2 = {'A','C','A','B','D','B'};
        String[] strings3 = {"A","B","C","D","E","A","B","C","D","E"};
        char[] tasks3 = new char[strings3.length];
        for (int i = 0; i < strings3.length; i++) {
            tasks3[i] = strings3[i].charAt(0);
        }
        int result = solution.leastInterval(tasks3,4);
        System.out.println(result);
    }

}
