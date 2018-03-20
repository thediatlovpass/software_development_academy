package com.sda.and1.tree.multi_tree;

public class Main {
    public static void main(String[] args){
        Node nodeA = new Node(null, "A");
        Node nodeB = new Node(null, "B");
        Node nodeC = new Node(null, "C");
        Node nodeD = new Node(null, "D");
        Node nodeE = new Node(null, "E");
        Node nodeF = new Node(null, "F");
        Node nodeG = new Node(null, "G");
        Node nodeH = new Node(null, "H");

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        nodeA.addChild(nodeD);

        nodeB.addChild(nodeE);
    }
}
