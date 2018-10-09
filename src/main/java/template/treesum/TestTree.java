package template.treesum;

import junit.framework.TestCase;

/**
 * @author: Vivian Xu
 */

public class TestTree extends TestCase {
    private static Tree ctTree;
    private static Tree sumTree;

    public void setUp() {
        ctTree = new CountTree();
        sumTree = new SumTree();
    }

    /**
     * Test case where count tree is empty
     */
    public void testCtEmpty() {
        assertTrue(ctTree.sum() == 0);
    }

    // Test case where sum tree is empty
    public void testSumEmpty() {
        assertTrue(sumTree.sum() == 0);
    }

    // Test counting for tree with one node
    public void testCtOne() {
        ctTree.insert(50);
        assertTrue(ctTree.sum() == 1);
    }

    // Test summing values for tree with one node
    public void testSumOne() {
        sumTree.insert(50);
        assertTrue(50 == sumTree.sum());
    }

    // Test counting for tree with many nodes
    public void testCtMany() {
        ctTree.insert(50);
        ctTree.insert(5);
        ctTree.insert(-15);
        ctTree.insert(25);
        ctTree.insert(100);
        assertTrue(5 == ctTree.sum());
    }

    // Test summing values for tree with many nodes
    public void testSumMany() {
        sumTree.insert(50);
        sumTree.insert(5);
        sumTree.insert(-15);
        sumTree.insert(25);
        sumTree.insert(100);
        assertTrue(165 == sumTree.sum());
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestTree.class);
    }
}

