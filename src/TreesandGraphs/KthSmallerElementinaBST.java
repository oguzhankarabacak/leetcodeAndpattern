package TreesandGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallerElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        List<Integer> num_list = new ArrayList<>();
        helper(root,num_list);
        Collections.sort(num_list);
        return num_list.get(k-1);
    }
    public void helper(TreeNode root, List<Integer> num_list) {
        if (root == null) return;

        num_list.add(root.val);
        helper(root.left, num_list);
        helper(root.right, num_list);

    }
    public static void main(String[] args) {
        KthSmallerElementinaBST kthSmallerElementinaBST = new KthSmallerElementinaBST();
        TreeNode _9 = new TreeNode(9,null,null);
        TreeNode _8 = new TreeNode(8,_9,null);
        TreeNode _3 = new TreeNode(3,null,_8);

        TreeNode _6 = new TreeNode(6,null,null);
        TreeNode _7 = new TreeNode(7,null,null);
        TreeNode _5 = new TreeNode(5,_6,_7);
        TreeNode _4 = new TreeNode(4,null,null);
        TreeNode _2 = new TreeNode(2,_4,_5);
        TreeNode _1 = new TreeNode(1,_2,_3);

        int result = kthSmallerElementinaBST.kthSmallest(_1, 3);
        System.out.println(result);
    }
}
