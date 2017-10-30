import static org.junit.Assert.*;

public class BSTTest {
    @org.junit.Test
    public void breadthFirstTraversal() throws Exception {
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);
        System.out.println("Root: " + tree.root.element);
        System.out.println("Root Left: " + tree.root.left.element);
        System.out.println("Root Right: " + tree.root.right.element);
        System.out.println("Breadth First Traversal:");
        tree.breadthFirstTraversal();
        System.out.println("\n Expected = 60 55 100 45 57 67 107 59 101");

    }

    @org.junit.Test
    public void height() throws Exception {
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);
        assertEquals(4,tree.height());
        System.out.println("\nTree Height:" + tree.height()+"\n");
        tree.insert(200);
        tree.insert(300);
        tree.insert(400);
        assertEquals(6,tree.height());
        System.out.println("Tree Height:" + tree.height()+"\n");
    }
}