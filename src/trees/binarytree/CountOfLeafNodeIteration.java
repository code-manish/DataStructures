package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CountOfLeafNodeIteration {

    TreeNode root;

    CountOfLeafNodeIteration() {
        root = null;
    }

    public static void main(String[] args) {
        CountOfLeafNodeIteration tree = new CountOfLeafNodeIteration();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Count of leaf node :" + getLeafNodeCount(tree.root));
    }

    private static int getLeafNodeCount(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left == null && temp.right == null) {
                count++;
            }
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return count;
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
