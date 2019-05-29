package example.tree.demo;

/**
 * Binary tree - at most 2 children
 * Strict/proper - 0 or 2 
 * complete -   all levels except last one are complete and nodes are as left as possible
 * perfect  - all levels filled
 * balanced b tree - difference between height left and right child should  not be more than K (mostly K=1)
 * 
 * 
 * Implementations variations 
 *   1. Dynamically created Nodes
 *   2. Arrays
 * 
 * @author king
 *
 */
public class TreeDemo{

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.println("\nInorder");
		root.inOrder();
		System.out.println("\nPreorder");
		root.preOrder();
		System.out.println("\nPostorder");
		root.postOrder();
		System.out.println();
		root.inorderNonRec(root);
		System.out.println();
		root.preorderNonRec(root);
		System.out.println();
		root.postorderNonRec(root);
		TreeNode.levelOrder(root);
		TreeNode.printLevelOrder(root);
	}
	

}


