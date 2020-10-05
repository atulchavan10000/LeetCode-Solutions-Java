package tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


 class TreeNode1 {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1() {}
     TreeNode1(int val) { this.val = val; }
     TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class BinaryTreeLevelOrderTraversal {
	public static  List<List<Integer>> levels = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		TreeNode1 root = new TreeNode1(3);
		root.left = new TreeNode1(9);
		root.right = new TreeNode1(20);
		root.left.left = new TreeNode1();
		root.left.right = new TreeNode1();
		root.right.left = new TreeNode1(15);
		root.right.right = new TreeNode1(7);
		System.out.println(levelOrder(root));
	}

/*
 * Approach: Recursive
 * Time: O(n)
 * Space: O(n)
 * 
    public static List<List<Integer>> levelOrder(TreeNode1 root) {
        if(root == null) return levels;
        helper(root, 0);
        return levels;
    }
    
    public static void helper(TreeNode1 node, int level){
        if(levels.size() == level) levels.add(new ArrayList<Integer>());
        levels.get(level).add(node.val);
        
        if(node.left != null) helper(node.left, level + 1);
        if(node.right != null) helper(node.right, level + 1);   
    }
*/
	
	public static List<List<Integer>> levelOrder(TreeNode1 root) {
	    List<List<Integer>> levels = new ArrayList<List<Integer>>();
	    if (root == null) return levels;

	    Queue<TreeNode1> queue = new LinkedList<TreeNode1>();
	    queue.add(root);
	    int level = 0;
	    while ( !queue.isEmpty() ) {
	      // start the current level
	      levels.add(new ArrayList<Integer>());

	      // number of elements in the current level
	      int level_length = queue.size();
	      for(int i = 0; i < level_length; ++i) {
	        TreeNode1 node = queue.remove();

	        // fulfill the current level
	        levels.get(level).add(node.val);

	        // add child nodes of the current level
	        // in the queue for the next level
	        if (node.left != null) queue.add(node.left);
	        if (node.right != null) queue.add(node.right);
	      }
	      // go to next level
	      level++;
	    }
	    return levels;
	  }
}