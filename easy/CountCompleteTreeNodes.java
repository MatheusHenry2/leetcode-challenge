package easy;

import support.TreeNode;

public class CountCompleteTreeNodes {

    public static int countNodes(TreeNode root) {
        if(root == null) return 0;
        return (1 + countNodes(root.left) + countNodes(root.right));
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(countNodes(root));
    }


}
