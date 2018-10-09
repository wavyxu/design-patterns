package template.treesum;

/**
 * @author: Vivian Xu
 */
// Template method example -- the template class for summing the values
// of the nodes of a binary search tree of int's
public abstract class Tree {
    private Node root;

    // The core of the algorithm -- includes the common code for adding up
    // values for the nodes in a binary search tree
    protected int getSum(Node next) {
        if (null == next) return 0;
        // valueOf is the primitive operation
        return valueOf(next) + getSum(next.getLeft()) + getSum(next.getRight());
    }

    // The algorithm method -- takes the recursive approach and calls
    // getSum to do the real work of computing the sum of the nodes in
    // the tree
    public int sum() {
        return getSum(root);
    }

    // The primitive operation in this case is to figure out what
    // value we want from a node
    public abstract int valueOf(Node node);

    // Insert a value into the tree
    public void insert(int v) {
        root = rInsert(v, root);
    }

    // The recursive helper function to do the actual insertion
    protected Node rInsert(int v, Node n) {
        if (n == null) return new Node(v);
        if (v <= n.getValue()) {
            n.setLeft(rInsert(v, n.getLeft()));
        }
        else {
            n.setRight(rInsert(v, n.getRight()));
        }
        return n;
    }

    // Print a tree
    public void printTree() {
        rPrint(root);
    }

    // The recursive helper function to do the actual printing
    protected void rPrint(Node n) {
        if (null == n) System.out.println("");
        System.out.println(n.getValue());
        System.out.print("Left = ");
        rPrint(n.getLeft());
        System.out.print("Right = ");
        rPrint(n.getRight());
    }
}
