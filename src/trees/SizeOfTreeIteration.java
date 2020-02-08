package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTreeIteration {

    TreeNode root;

    public static void main(String[] args) {
        SizeOfTreeIteration tree = new SizeOfTreeIteration();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Size Of Binary Tree: " + tree.getSizeOfTree(tree.root));
    }

    private int getSizeOfTree(TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 1;
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            if (null != tempNode) {
                if (null != tempNode.left) {
                    count++;
                    queue.offer(tempNode.left);
                }
                if (null != tempNode.right) {
                    count++;
                    queue.offer(tempNode.right);
                }
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
