package tree;

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
/*
 * 
 * */
 
/* public class MaximumDepthOfBinaryTree {
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

*/

/*
 * Time: O(n)
 * Space: O(n) 
 * */
 public int maxDepth(TreeNode root) {
     LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
     LinkedList<Integer> depths = new LinkedList<Integer>();
     
     stack.add(root);
     depths.add(1);
     int current_depth = 0, depth = 0;
     while(!stack.isEmpty()){
         root = stack.pollLast();
         current_depth = depths.pollLast();
         if(root != null){
             depth = Math.max(depth, current_depth);
             stack.add(root.left);
             stack.add(root.right);
             depths.add(1 + current_depth);
             depths.add(1 + current_depth);
         }
     }
     return depth;
 }


