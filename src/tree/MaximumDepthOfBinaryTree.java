package tree;
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

public class MaximumDepthOfBinaryTree {
	public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		node.left = new TreeNode(11);
		node.right = new TreeNode(12);
		node.left.left = new TreeNode(15);
		node.left.left.left = new TreeNode(16);
		
		System.out.println(maxDepth(node));
	}

}


