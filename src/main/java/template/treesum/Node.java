package template.treesum;

/**
 * @author: Vivian Xu
 */
public class Node {
    private int val;
    private Node left, right;

    public Node(int _val) { val = _val; left = right = null; }

    public int getValue() { return val; }
    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public void setLeft(Node n) { left = n; }
    public void setRight(Node n) { right = n; }
}
