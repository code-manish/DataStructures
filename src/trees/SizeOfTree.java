package trees;

public class SizeOfTree {
    public static void main(String[] args) {
        SizeOfTree tree = new SizeOfTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Size of the tree is :" + tree.getSizeOfTree(root));
    }

    private int getSizeOfTree(Node root) {
        if (null == root) {
            return 0;
        }
        return (getSizeOfTree(root.left) + getSizeOfTree(root.right) + 1);
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
