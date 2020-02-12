package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTreeIteration {
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

    private static boolean areIdentical(Node root1, Node root2){
        if(null == root1 && null == root2) {
            return true;
        }
        if(null == root1 || null == root2){
            return false;
        }
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();

        queue1.add(root1);
        queue2.add(root2);

        while(!queue1.isEmpty() && !queue2.isEmpty()){
            Node n1 = queue1.poll();
            Node n2 = queue2.poll();
            if(n1.data != n2.data){
                return false;
            }
            if(n1.left != null && n2.left != null){
                queue1.add(n1.left);
                queue2.add(n2.left);
            }
            else if(n1.left != null || n2.left != null){
                return false;
            }
            if(n1.right != null && n2.right != null){
                queue1.add(n1.right);
                queue2.add(n2.right);
            }
            else if(n1.right != null || n2.right != null){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(99);

        if (areIdentical(root1,root2)){
            System.out.println("Trees are identical");
        } else{
            System.out.println("Trees are not identical");
        }
    }
}
