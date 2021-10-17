package GreatLearning.ProblemTwo.Services;

public class BSTConversion {

    public static Node prevNode = null;
    public static Node headNode = null;

    /*
     * Function to convert the binary search tree into a skewed tree in  increasing  order
     */
    public void RightSkewed(Node root) {

        // Base Case
        if (root == null) {
            return;
        }

        //recurse for the left
        RightSkewed(root.getLeft());

        Node rightNode = root.getRight();

        /*
         * Condition to check if the root Node of the skewed tree is not defined
         */
        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.setRight(root);
        }

        root.setLeft(null);
        prevNode = root;

        // recurse for the right
        RightSkewed(rightNode);
    }

    /*
     * Function to traverse the right skewed tree using recursion
     */
    public void TraverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        TraverseRightSkewed(root.getRight());
    }
}
