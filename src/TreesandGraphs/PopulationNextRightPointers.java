package TreesandGraphs;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


public class PopulationNextRightPointers {
    public Node connect(Node root) {
        if (root == null) return root;

        List<List<Node>> depthList = new ArrayList<>();
        helper(root,0,depthList);
        for (List<Node> innerList : depthList) {
            for (int i = 0; i < innerList.size()-1; i++) {
                innerList.get(i).next = innerList.get(i+1);
            }
        }
        return root;

    }
    public void helper(Node root, int depth, List<List<Node>> depthList) {
        if (root == null) return;

        if (depthList.size() < depth + 1) {
            depthList.add(new ArrayList<>());
        }
        depthList.get(depth).add(root);
        helper(root.left, depth + 1, depthList);
        helper(root.right, depth + 1, depthList);
    }
    //public Node helper(Node root)

    public static void main(String[] args) {
        Node _4 = new Node(4,null,null,null);
        Node _5 = new Node(5,null,null,null);
        Node _6 = new Node(6,null,null,null);
        Node _7 = new Node(7,null,null,null);

        Node _2 = new Node(2,_4,_5,null);
        Node _3 = new Node(3,_6,_7,null);

        Node _1 = new Node(1,_2,_3,null);

        PopulationNextRightPointers populationNextRightPointers = new PopulationNextRightPointers();
        Node result = populationNextRightPointers.connect(_1);
        System.out.println(result);
    }

}
