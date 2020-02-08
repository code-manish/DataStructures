package trees;

public class TreeTraversalExample {
    Node root;

    TreeTraversalExample() {
        root = null;
    }

    public static void main(String[] args) {
        TreeTraversalExample tree = new TreeTraversalExample();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("PreOrderTraversal of the tree");
        tree.printPreOrder();
        System.out.println("\nInorderTraversal of the tree");
        tree.printInOrderTree();
        System.out.println("\nPostOrderTraversal of the tree");
        tree.printPostOrderTree();

    }

    void postOrderTraversal(Node root) {
        if (null == root) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        printKey(root);
    }

    void preOrderTraversal(Node root) {
        if (null == root) {
            return;
        }
        printKey(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(Node root) {
        if (null == root) {
            return;
        }
        inOrderTraversal(root.left);
        printKey(root);
        inOrderTraversal(root.right);
    }

    void printPostOrderTree() {
        postOrderTraversal(root);
    }

    void printInOrderTree() {
        inOrderTraversal(root);
    }

    void printPreOrder() {
        preOrderTraversal(root);
    }

    void printKey(Node node) {
        System.out.print(" " + node.key);
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}


