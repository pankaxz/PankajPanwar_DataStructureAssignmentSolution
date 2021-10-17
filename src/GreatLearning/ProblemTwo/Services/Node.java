package GreatLearning.ProblemTwo.Services;

/**
 * A node class for binary trees.
 */
public class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}