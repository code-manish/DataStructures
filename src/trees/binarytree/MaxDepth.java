package trees.binarytree;

public class MaxDepth {
    TreeNode root;

    MaxDepth() {
        root = null;
    }

    public static void main(String[] args) {
        MaxDepth tree = new MaxDepth();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Max Depth of the tree: " + getMaxDepth(tree.root));
    }

    private static int getMaxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftTreeDepth = getMaxDepth(root.left);
        int rightTreeDepth = getMaxDepth(root.right);
        return (leftTreeDepth > rightTreeDepth ? leftTreeDepth + 1 : rightTreeDepth + 1);
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
