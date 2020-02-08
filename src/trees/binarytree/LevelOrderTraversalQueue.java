package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalQueue {
    Node root;

    public static void main(String[] args) {
        LevelOrderTraversalQueue tree = new LevelOrderTraversalQueue();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level Order traversal of the tree ");
        tree.printLevelOrderTraversal();
    }

    private void printLevelOrderTraversal() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node tempNode = nodeQueue.poll();
            System.out.println(tempNode.data + " ");

            if (tempNode.left != null) {
                nodeQueue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                nodeQueue.add(tempNode.right);
            }
        }
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
