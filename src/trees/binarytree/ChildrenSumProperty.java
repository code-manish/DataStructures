package trees.binarytree;

public class ChildrenSumProperty {
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

    private boolean isChildrenSumPropertyTrue(Node node){
        int leftData = 0;
        int rightData = 0;

        if(null == node || (node.left == null && node.right == null)){
            return true;
        }
        if(node.left != null){
            leftData = node.left.data;
        }
        if(node.right != null){
            rightData = node.right.data;
        }
        return node.data == (leftData + rightData) && isChildrenSumPropertyTrue(node.left) && isChildrenSumPropertyTrue(node.right);
    }

    public static void main(String[] args) {
        ChildrenSumProperty tree = new ChildrenSumProperty();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);

        if(tree.isChildrenSumPropertyTrue(tree.root)){
            System.out.println("Tree satisfies Children Sum property");
        } else {
            System.out.println("Tree doesnot satisfy Children sum property");
        }
    }

}
