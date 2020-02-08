package trees.binarytree;

public class TreeBasic {

    Node root;

    TreeBasic(int key) {
        root = new Node(key);
    }

    TreeBasic() {
        root = null;
    }

    public static void main(String[] args) {
        TreeBasic tree = new TreeBasic();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
    }

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            left = right = null;
            key = item;
        }
    }
}

