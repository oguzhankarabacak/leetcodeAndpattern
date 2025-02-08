import ArrayandString.CountandSay;
import ArrayandString.IncreasingTripletSubsequence;
import DynamicProgramming.JumpGame;
import LinkedList.AddTwoNumbers;
import LinkedList.Intersectionof2LinkedList;
import LinkedList.ListNode;
import LinkedList.OddEvenLinkedList;
import Math.HappyNumber;
import Math.TrailingZeroes;
import Math.*;
import DynamicProgramming.*;
import TreesandGraphs.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        ArrayandString.SetMatrixZero setMatrixZero = new ArrayandString.SetMatrixZero();
        setMatrixZero.setZeroes(matrix);

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        ArrayandString.GroupAnagrams groupAnagrams = new ArrayandString.GroupAnagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        System.out.println(result);

        ArrayandString.LongestSubstringwithoutRepeating longestSubstringwithoutRepeating = new ArrayandString.LongestSubstringwithoutRepeating();
        String s = "abcabcbb";
        int result = longestSubstringwithoutRepeating.lengthOfLongestSubstring(s);
        System.out.println(result);

        ArrayandString.LongestPalindrome longestPalindrome = new ArrayandString.LongestPalindrome();
        String s = "babad";
        String result = longestPalindrome.longestPalindrome(s);
        System.out.println(result);

        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] nums = {20,100,10,12,5,13};
        boolean result = increasingTripletSubsequence.increasingTriplet(nums);

        CountandSay countandSay = new CountandSay();
        String result = countandSay.countAndSay(5);
        System.out.println(result); */

        /*
        ListNode l11 = new ListNode(9,null);
        ListNode l12 = new ListNode(9,l11);
        ListNode l13 = new ListNode(9,l12);
        ListNode l14 = new ListNode(9,l13);
        ListNode l15 = new ListNode(9,l14);
        ListNode l16 = new ListNode(9,l15);
        ListNode l17 = new ListNode(9,l16);

        ListNode l21 = new ListNode(9,null);
        ListNode l22 = new ListNode(9,l21);
        ListNode l23 = new ListNode(9,l22);
        ListNode l24 = new ListNode(9,l23);

        ListNode l31 = new ListNode(7,null);
        ListNode l32 = new ListNode(3,l31);

        ListNode l41 = new ListNode(2, null);
        ListNode l42 = new ListNode(9, l41);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l17, l24);
        System.out.println(result);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

         ListNode l1 = new ListNode(7,null);
         ListNode l2 = new ListNode(6,l1);
         ListNode l3 = new ListNode(4,l2);
         ListNode l4 = new ListNode(3,l3);
         ListNode l5 = new ListNode(1,l4);

        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        ListNode result = oddEvenLinkedList.oddEvenList(l5); */

        /*
        ListNode l1 = new ListNode(5,null);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(8,l2);

        ListNode l4 = new ListNode(1,l3);
        ListNode l5 = new ListNode(4,l4);

        ListNode l6 = new ListNode(1,l3);
        ListNode l7 = new ListNode(6,l6);
        ListNode l8 = new ListNode(5,l7);

        Intersectionof2LinkedList intersectionof2LinkedList = new Intersectionof2LinkedList();
        ListNode result = intersectionof2LinkedList.getIntersectionNode(l5,l8);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
         */

        /*
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.isHappy(2);
        System.out.println(result);
        */

        /*
        TrailingZeroes trailing = new TrailingZeroes();
        int result = trailing.trailingZeroes(30);
        System.out.println(result);


        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        int result = excelSheetColumnNumber.titleToNumber("AABD");
        System.out.println(result); */
        /*
        Pow pow = new Pow();
        double result = pow.myPow(2.0, -2147483648);
        System.out.println(result); */
        /*
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(2147395600);
        System.out.println(result);
        */
        /*
        DvideTwoIntegers dvideTwoIntegers = new DvideTwoIntegers();
        int result = dvideTwoIntegers.divide(-2147483648,2);
        System.out.println(result);
         */
        /*
        FractiontoRecurringDecimal fractiontoRecurringDecimal = new FractiontoRecurringDecimal();
        String result = fractiontoRecurringDecimal.fractionToDecimal(4,9);
        System.out.println(result);
         */

        /*
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3,2,1,0,4};
        boolean result = jumpGame.canJump(nums);
        System.out.println(result); */
        int[] coins = {1,2,5};
        CoinChange coinChange = new CoinChange();
        int result = coinChange.coinChange(coins,11);
        System.out.println(result);

        /*
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int[] nums = {7,7,7,7,7,7,7};
        int result = longestIncreasingSubsequence.lengthOfLIS(nums);
        System.out.println(result); */

        TreeNode _9 = new TreeNode(9,null,null);
        TreeNode _8 = new TreeNode(8,_9,null);
        TreeNode _3 = new TreeNode(3,null,_8);

        TreeNode _6 = new TreeNode(6,null,null);
        TreeNode _7 = new TreeNode(7,null,null);
        TreeNode _5 = new TreeNode(5,_6,_7);
        TreeNode _4 = new TreeNode(4,null,null);
        TreeNode _2 = new TreeNode(2,_4,_5);
        TreeNode _1 = new TreeNode(1,_2,_3);

        /*
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(_1);
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        BinaryTreeZigzagLevelOrder binaryTreeZigzagLevelOrder = new BinaryTreeZigzagLevelOrder();
        List<List<Integer>> result = binaryTreeZigzagLevelOrder.zigzagLevelOrder(_1);
        for (List<Integer> innerList : result) {
            for (Integer e : innerList){
                System.out.print(e + " ");
            }
            System.out.println();
        } */
    }
}