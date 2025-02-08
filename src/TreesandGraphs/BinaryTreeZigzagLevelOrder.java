package TreesandGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagList = new ArrayList<>();
        helper(root, 0, zigzagList);
        for (int i = 0; i < zigzagList.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(zigzagList.get(i));
            }
        }
        return zigzagList;
    }

    public void helper(TreeNode root, int depth, List<List<Integer>> zigzagList) {
        if (root == null) return;
        if (zigzagList.size() < depth + 1) {
            zigzagList.add(new ArrayList<>());
        }

        zigzagList.get(depth).add(root.val);
        helper(root.left, depth + 1, zigzagList);
        helper(root.right, depth + 1, zigzagList);

    }
}
