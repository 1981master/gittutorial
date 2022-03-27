import java.util.*;

public class N_aryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        
        if(root == null) return li;
        
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            li.add(node.val);
            Collections.reverse(node.children);
            for(Node child: node.children){
                stack.add(child);
            }
        }
        return li;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

