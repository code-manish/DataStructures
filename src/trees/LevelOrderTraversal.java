package trees;

public class LevelOrderTraversal {
    Node root;

    LevelOrderTraversal() {
        root = null;
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level Order Traversal of the tree ");
        tree.printLevelOrder();
    }

    private void printLevelOrder() {
        int heightOfTree = getHeightOfTree(root);
        int i;
        for (i = 1; i <= heightOfTree; i++) {
            printGivenLevel(root, i);
        }
    }

    private void printGivenLevel(Node node, int level) {
        if (null == node) {
            return;
        }
        if (1 == level) {
            System.out.println(node.data + " ");
        } else if (level > 1) {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    private int getHeightOfTree(Node node) {
        if (null == node) {
            return 0;
        }
        int leftHeight = getHeightOfTree(node.left);
        int rightHeight = getHeightOfTree(node.right);

        return (leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }
}
