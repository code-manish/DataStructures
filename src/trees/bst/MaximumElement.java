package trees.bst;

public class MaximumElement {

    public static void main(String[] args) {
        MaximumElement tree = new MaximumElement();
        Node root = tree.insertNodeToBST(null, 4);
        tree.insertNodeToBST(root, 1);
        tree.insertNodeToBST(root, 3);
        tree.insertNodeToBST(root, 2);
        tree.insertNodeToBST(root, 5);
        tree.insertNodeToBST(root, 10);
        tree.insertNodeToBST(root, 11);

        System.out.println("Maximum Element in the BST is " + tree.maximumValue(root));
    }

    private Node insertNodeToBST(Node node, int data) {
        if (null == node) {
            return new Node(data);
        }
        if (data >= node.data) {
            node.right = insertNodeToBST(node.right, data);
        } else {
            node.left = insertNodeToBST(node.left, data);
        }
        return node;
    }

    private int maximumValue(Node node) {
        Node currentNode = node;
        while (null != currentNode.right) {
            currentNode = currentNode.right;
        }
        return currentNode.data;
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
