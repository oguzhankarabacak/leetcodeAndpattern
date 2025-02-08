package TreesandGraphs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> leftResult = inorderTraversal(root.left);
        if (!leftResult.isEmpty()) result.addAll(leftResult);

        result.add(root.val);

        List<Integer> rightResult = inorderTraversal(root.right);

        if (!rightResult.isEmpty()) result.addAll(rightResult);

        return result;
    }
}
