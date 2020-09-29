package tree;

/*
 * LC-110 : Balanced Binary Tree
 * */
public class BalancedBinaryTree {

	/*
	 * Approach 1: Top Down recursion
	 * Time: O(n log n), Space: O(n log n)
	 * */
	/*public boolean isBalanced(TreeNode root) {
        if(root == null) return true; // base case
        
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(heightDiff) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
        
    }
    
    public int getHeight(TreeNode root){
        if(root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    */
	
	/*
	 * Approach 2: Top Down recursion
	 * Time: O(n log n), Space: O(n log n)
	 * */
	
	 public boolean isBalanced(TreeNode root) {
	        return checkHeight(root) != Integer.MIN_VALUE;
	    }
	    
	    public int checkHeight(TreeNode root){
	        if(root == null) return -1; // Base case
	        
	        int leftHeight = checkHeight(root.left);
	        if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Pass error up
	        
	        int rightHeight = checkHeight(root.right);
	        if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Pass error up
	        
	        int heightDiff = leftHeight - rightHeight;
	        if(Math.abs(heightDiff) > 1){
	            return Integer.MIN_VALUE;
	        }else{
	            return 1 + Math.max(leftHeight, rightHeight);
	        }
	    }
    
}
