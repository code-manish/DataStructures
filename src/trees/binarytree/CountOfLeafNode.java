package trees.binarytree;

public class CountOfLeafNode {
    TreeNode root;

    CountOfLeafNode() {
        root = null;
    }

    public static void main(String[] args) {
        CountOfLeafNode tree = new CountOfLeafNode();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Count of Leaf Nodes: " + tree.getLeafNodesCount(tree.root));
    }

    private int getLeafNodesCount(TreeNode root) {
        if (null == root) {
            return 0;
        }
        if (null == root.left && null == root.right) {
            return 1;
        }
        return (getLeafNodesCount(root.left) + getLeafNodesCount(root.right));
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
