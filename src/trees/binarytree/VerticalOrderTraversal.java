package trees.binarytree;

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderTraversal {
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

    private static void getVerticalOrder(Node root, int horizontalDistance, TreeMap<Integer, Vector<Integer>> map){
        if(null == root){
            return;
        }
        Vector<Integer> vectorList = map.get(horizontalDistance);
        if(vectorList == null){
            vectorList = new Vector<>();
        }
        vectorList.add(root.data);
        map.put(horizontalDistance,vectorList);

        getVerticalOrder(root.left, horizontalDistance - 1, map);
        getVerticalOrder(root.right, horizontalDistance +1, map);

    }

    private static void printVerticalOrder(Node root){
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
        int horizontalDistance = 0;
        getVerticalOrder(root, horizontalDistance, map);
        for (Map.Entry<Integer, Vector<Integer>> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
    }
}
