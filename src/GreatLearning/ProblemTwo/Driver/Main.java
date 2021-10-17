package GreatLearning.ProblemTwo.Driver;

import GreatLearning.ProblemTwo.Services.BSTConversion;
import GreatLearning.ProblemTwo.Services.Node;

/**
 * Problem : Convert the Binary Search Tree into a Skewed Tree
 * Solution : Traversing the BST in inorder traversal will give us a skewed tree.
 */
public class Main {
    public Node node;
    public static void main(String[] args) {
        // Driver Code
        BSTConversion bstConversion = new BSTConversion();
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getLeft().setRight(new Node(40));


        bstConversion.RightSkewed(tree.node);
        bstConversion.TraverseRightSkewed(bstConversion.headNode);
    }
}

