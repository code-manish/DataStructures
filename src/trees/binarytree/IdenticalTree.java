package trees.binarytree;

public class IdenticalTree {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root1;
    TreeNode root2;

    boolean identicalTrees(TreeNode node1, TreeNode node2){
        if(null == node1 && null == node2){
            return true;
        }
        if(null != node1 && null != node2){
            return (node1.data == node2.data
                    && identicalTrees(node1.left, node2.left)
                    && identicalTrees(node1.right, node2.right)
            );
        }
        return false;
    }

    public static void main(String[] args) {
        IdenticalTree tree = new IdenticalTree();
        tree.root1 = new TreeNode(1);
        tree.root1.left = new TreeNode(2);
        tree.root1.right = new TreeNode(3);
        tree.root1.left.left = new TreeNode(4);
        tree.root1.left.right = new TreeNode(5);

        tree.root2 = new TreeNode(1);
        tree.root2.left = new TreeNode(2);
        tree.root2.right = new TreeNode(3);
        tree.root2.left.left = new TreeNode(4);
        tree.root2.left.right = new TreeNode(5);

        if(tree.identicalTrees(tree.root1, tree.root2)){
            System.out.println("Identical Tree");
        } else {
            System.out.println("Trees are not identical");
        }
    }
}
