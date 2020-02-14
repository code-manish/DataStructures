package trees.binarytree;

public class SumTreeProperty {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    private int sum(Node node){
        if(null == node){
            return 0;
        }
        return node.data+(sum(node.left) + (sum(node.right)));
    }

    private boolean isSumTree(Node node){
        if(node == null || (node.left == null && node.right == null)){
            return true;
        }

        int leftSum = 0;
        int rightSum = 0;

        leftSum = sum(node.left);
        rightSum = sum(node.right);

        return node.data == (leftSum + rightSum) && (isSumTree(node.left)) && isSumTree(node.right);
    }

    public static void main(String[] args) {
        SumTreeProperty tree = new SumTreeProperty();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);

        if(tree.isSumTree(tree.root)){
            System.out.println("Tree is a sum tree");
        } else {
            System.out.println("Tree is not a sum tree");
        }
    }

}
