package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Sorting {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (right > left) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)) {
                left =  mid + 1;
            }
            else {
                right = mid;
            }

        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return n == 2;
    }

    public boolean isValid(String s) {
        if (s.length() == 0) return true;

        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (parentheses.isEmpty()) {
                parentheses.add(s.charAt(i));
                continue;
            }
            char last = parentheses.peek();
            if (s.charAt(i) == ')' && last == '(') {
                parentheses.pop();
            } else if  (s.charAt(i) == ']' && last == '[') {
                parentheses.pop();
            }
            else if  (s.charAt(i) == '}' && last == '{') {
                parentheses.pop();
            }
            else {
                parentheses.add(s.charAt(i));
            }

        }
        return parentheses.empty();

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        pascal.add(row1);
        int counter = 2;
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < counter; j++) {
                if (j == 0 || j == counter - 1) {
                    row.add(1);
                }
                else {
                    int num1 = pascal.get(i-1).get(j-1);
                    int num2 = pascal.get(i-1).get(j);
                    row.add(num1 + num2);
                }
            }
            pascal.add(row);
            counter += 1;
        }
        return pascal;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        //System.out.println(sorting.firstBadVersion(2));


        List<List<Integer>> result = sorting.generate(5);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
