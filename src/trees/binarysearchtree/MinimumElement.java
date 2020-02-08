package trees.binarysearchtree;

/*
In BST, left most element has the lowest value - find node such that node.left == null
 */
public class MinimumElement {
    public static void main(String[] args) {
        MinimumElement tree = new MinimumElement();
        Node root = tree.insertNode(null, 4);
        tree.insertNode(root, 2);
        tree.insertNode(root, 1);
        tree.insertNode(root, 3);
        tree.insertNode(root, 6);
        tree.insertNode(root, 5);

        System.out.println("Minimum value of BST: " + tree.minValue(root));
    }

    private Node insertNode(Node node, int data) {
        if (null == node) {
            return (new Node(data));
        }
        if (data <= node.data) {
            node.left = insertNode(node.left, data);
        } else {
            node.right = insertNode(node.right, data);
        }
        return node;
    }

    private int minValue(Node node) {
        Node current = node;
        while (null != current.left) {
            current = current.left;
        }
        return current.data;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
