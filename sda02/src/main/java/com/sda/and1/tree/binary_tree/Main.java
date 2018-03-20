package com.sda.and1.tree.binary_tree;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.addLeftChild(nodeB);
        nodeA.addRightChild(nodeC);

        nodeB.addLeftChild(nodeD);
        nodeB.addRightChild(nodeE);

        nodeC.addLeftChild(nodeF);
        nodeC.addRightChild(nodeG);

        System.out.println(heightOfTree(nodeA));
    }

    private static int heightOfTree(Node node){
        if(node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(node.getLeft());
        int rightHeight = heightOfTree(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
